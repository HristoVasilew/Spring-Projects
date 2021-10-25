package com.example.musicdb.service.impl;

import com.example.musicdb.model.entity.User;
import com.example.musicdb.model.service.UserServiceModel;
import com.example.musicdb.repository.UserRepository;
import com.example.musicdb.security.CurrentUser;
import com.example.musicdb.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.currentUser = currentUser;
    }


    @Override
    public void registerUser(UserServiceModel userServiceModel) {
        User user = modelMapper.map(userServiceModel, User.class);

        userRepository.save(user);
    }

    @Override
    public UserServiceModel findByUsernameAndPassword(String username, String password) {
        return userRepository
                .findByUsernameAndPassword(username,password)
                .map(user -> modelMapper.map(user,UserServiceModel.class))
                .orElse(null);
    }

    @Override
    public void loginUser(Long id, String username) {

//        User user= userRepository.getByIdAndName(id,username);
//
//        if (user == null) {
//            return false;
//        }

        currentUser.setId(id).setUsername(username);
    }

    @Override
    public User findById(Long id) {

        return userRepository
                .findById(id)
                .orElse(null);
    }
}
