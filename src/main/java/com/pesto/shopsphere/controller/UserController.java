package com.pesto.shopsphere.controller;

import com.pesto.shopsphere.model.User;
import com.pesto.shopsphere.repository.UserRepository;
import com.pesto.shopsphere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //get user data from mongodb
    @GetMapping("/user/{username}")
    public User getUser(@PathVariable String username) {
        return userRepository.findByUsername(username);
    }
    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
