package com.siheca.authentication.service.impl;

import com.siheca.authentication.repository.UserRepository;
import com.siheca.authentication.entities.User;
import com.siheca.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
@Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getUsers() {
        List<User> all = userRepository.findAll();
        return all;
    }
}
