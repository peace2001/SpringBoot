package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(String username, String password) {
        return userRepository.CheckUser(username,password);
    }
}
