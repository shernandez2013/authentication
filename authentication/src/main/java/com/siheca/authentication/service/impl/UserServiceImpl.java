package com.siheca.authentication.service.impl;

import com.siheca.authentication.entities.User;
import com.siheca.authentication.repository.UserRepository;
import com.siheca.authentication.request.UserRequest;
import com.siheca.authentication.response.UserResponse;
import com.siheca.authentication.service.UserService;
import com.siheca.authentication.util.HashingData;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserResponse> getUsers() {
        return userRepository.findAll().stream().map(UserResponse::new).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void saveUser(UserRequest userRequest) throws Exception {
        User user = new User();
        user.setId(0);
        user.setName(userRequest.getName());
        user.setLastName(userRequest.getLastName());
        user.setPassword(HashingData.encrypt(userRequest.getPassword()));
        userRepository.save(user);
    }


}
