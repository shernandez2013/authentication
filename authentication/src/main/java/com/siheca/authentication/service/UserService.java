package com.siheca.authentication.service;

import com.siheca.authentication.request.UserRequest;
import com.siheca.authentication.response.UserResponse;

import java.util.List;

public interface UserService {

    List<UserResponse> getUsers();
    void saveUser(UserRequest userRequest) throws Exception;
}
