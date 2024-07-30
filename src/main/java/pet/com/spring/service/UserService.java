package pet.com.spring.service;

import pet.com.spring.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User updateUser(Long userId, User userDetails);
    void deleteUser(Long userId);
    User getUserById(Long userId);
    List<User> getAllUsers();
}

