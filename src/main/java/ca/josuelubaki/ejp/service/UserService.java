package ca.josuelubaki.ejp.service;

import ca.josuelubaki.ejp.data.mapper.Mapper;
import ca.josuelubaki.ejp.data.model.User;
import ca.josuelubaki.ejp.data.request.UserRequest;
import ca.josuelubaki.ejp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final Mapper mapper;

    public UserService(
            UserRepository userRepository,
            Mapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(UserRequest userRequest) {
        return userRepository.save(mapper.toUser(userRequest));
    }
}