package com.example.its.domain.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final com.example.its.domain.auth.UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}