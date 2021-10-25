package com.example.exam.service;

import com.example.exam.model.entity.User;
import com.example.exam.model.service.UserServiceModel;

import java.util.List;

public interface UserService {
    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);

    void loginUser(Long id, String username);

    User findById(Long id);

    List<User> findAllUsers();
}
