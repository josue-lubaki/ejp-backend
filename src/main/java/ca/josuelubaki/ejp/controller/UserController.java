package ca.josuelubaki.ejp.controller;

import ca.josuelubaki.ejp.data.model.User;
import ca.josuelubaki.ejp.data.request.UserRequest;
import ca.josuelubaki.ejp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody UserRequest user) {
        return userService.saveUser(user);
    }
}