package net.javaguides.springboot.mapper;

import net.javaguides.springboot.dto.UserDTO;
import net.javaguides.springboot.entity.User;

public class UserMapper {

    // Convert User JPA to UserDTO
    public static UserDTO mapToUserDTO(User user) {
        UserDTO userDTO = new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDTO;
    }

    // Convert UserDTO to User JPA Entity
    public static User mapToUser(UserDTO userDTO) {
        User user = new User(
                userDTO.getId(),
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getEmail()
        );
        return user;
    }
}
