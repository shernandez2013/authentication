package com.siheca.authentication.controller;

import com.siheca.authentication.request.UserRequest;
import com.siheca.authentication.response.UserResponse;
import com.siheca.authentication.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1")
@ApiOperation("User API")
public class UserController {

    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "users", notes = "Operation api to retrieve all users")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved", response = UserResponse.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Not found - User are not found")
    })
    @GetMapping(path = "/users")
    List<UserResponse> getUsers() {
        return userService.getUsers();
    }

    @ApiOperation(value = "Save User", notes = "Save user in DB")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully saved"),
            @ApiResponse(code = 400, message = "Not saved - data not saved")
    })
    @PostMapping(path = "/users")
    void saveUser(@RequestBody UserRequest userRequest) throws Exception {
        userService.saveUser(userRequest);
    }
}
