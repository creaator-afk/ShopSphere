package com.pesto.shopsphere.service;

import com.pesto.shopsphere.model.User;
import com.pesto.shopsphere.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;


public class SelfUserService implements UserService{

    UserRepository userRepository;
    public SelfUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User deleteUser(int id) {
        return null;
    }
}
