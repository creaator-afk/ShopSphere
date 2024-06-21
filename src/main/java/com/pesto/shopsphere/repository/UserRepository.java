package com.pesto.shopsphere.repository;

import com.pesto.shopsphere.model.User;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

public interface UserRepository extends MongoRepository<User, String> {
    @Override
    User save(User user);
    User findByUsername(String username);
}
