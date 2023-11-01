package net.javaguides.springboot.service;

import net.javaguides.springboot.dto.UserDTO;
import net.javaguides.springboot.entity.User;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
