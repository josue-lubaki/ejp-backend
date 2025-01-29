package ca.josuelubaki.ejp.data.mapper;

import ca.josuelubaki.ejp.data.model.User;
import ca.josuelubaki.ejp.data.request.UserRequest;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public static UserRequest toRequest(User user) {
        return UserRequest.builder()
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }

    public User toUser(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        return user;
    }
}
