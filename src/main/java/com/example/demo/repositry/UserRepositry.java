package com.example.demo.repositry;

import com.example.demo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepositry extends MongoRepository<User, String> {

    Optional<User> findByUserName(String userName);
}
