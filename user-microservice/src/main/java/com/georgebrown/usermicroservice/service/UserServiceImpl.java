package com.georgebrown.usermicroservice.service;

import com.georgebrown.usermicroservice.dto.UserRequest;
import com.georgebrown.usermicroservice.dto.UserResponse;
import com.georgebrown.usermicroservice.model.User;
import com.georgebrown.usermicroservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void createUser(UserRequest userRequest) {
        User user = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .build();
        userRepository.save(user);

    }

    @Override
    public String updateUser(String userId, UserRequest userRequest) {
        return null;
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public User getUser(String userId) {
        return null;
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return null;
    }
}
