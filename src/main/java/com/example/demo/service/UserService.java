package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {

    public User login(String username,String password);
}
