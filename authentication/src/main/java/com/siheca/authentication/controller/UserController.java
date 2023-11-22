package com.siheca.authentication.controller;

import com.siheca.authentication.entities.User;
import com.siheca.authentication.response.UserResponse;
import com.siheca.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1")
public class UserController {

    private UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/users")
    List<UserResponse> getUsers(){
        List<User> users = userService.getUsers();
        return null;
    }
}
