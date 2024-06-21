package com.pesto.shopsphere.service;

import com.pesto.shopsphere.model.User;

public interface UserService {
    User getUserByEmail(String email);
    User getUserByUsername(String username);
    User createUser(User user);
    User updateUser(User user);
    User deleteUser(int id);
}
