package com.georgebrown.usermicroservice.service;

import com.georgebrown.usermicroservice.dto.UserRequest;
import com.georgebrown.usermicroservice.dto.UserResponse;
import com.georgebrown.usermicroservice.model.User;

import java.util.List;

public interface UserService {
    void createUser(UserRequest userRequest);

    String updateUser(String userId, UserRequest userRequest);
    void deleteUser(String userId);
    User getUser(String userId);
    List<UserResponse> getAllUsers();
}
