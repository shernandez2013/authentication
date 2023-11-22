package com.siheca.authentication.controller;

import com.siheca.authentication.request.UserRequest;
import com.siheca.authentication.response.UserResponse;
import com.siheca.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1")
public class UserController {

    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/users")
    List<UserResponse> getUsers(){
        return  userService.getUsers();
    }

    @PostMapping(path = "/users")
    void saveUser(@RequestBody UserRequest userRequest){
        userService.saveUser(userRequest);
    }
}
