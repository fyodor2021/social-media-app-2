package com.georgebrown.usermicroservice.controller;

import com.georgebrown.usermicroservice.dto.UserRequest;
import com.georgebrown.usermicroservice.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createService(@RequestBody UserRequest userRequest){
        userService.createUser(userRequest);
    }

}
