package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repositry.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepositry userRepositry;

    public String register(User user){
        Optional<User> existingUser = userRepositry.findByUserName(user.getUserName());
        if(existingUser.isPresent()){
            return "Username already exist";
        }
        userRepositry.save(user);
        return "User registered successfully";
    }

    public String login(String userName, String password){
        Optional<User> user = userRepositry.findByUserName(userName);
        if(user.isEmpty()){
            return "User not found!";
        }
        if(!user.get().getPassword().equals(password)){
            return "Invalid password!";
        }

        User loggedInUser = user.get();
        loggedInUser.setLoggedIn(true);
        userRepositry.save(loggedInUser);
        return "Logged in successful! Welcome" + userName;
    }

    public String logOut(String userName){
        Optional<User> user = userRepositry.findByUserName(userName);
        if (user.isEmpty()){
            return "user not found!";
        }
        if (!user.get().isLoggedIn()){
            return "user is logged out";
        }

        User loggedOutUser = user.get();
        loggedOutUser.setLoggedIn(false);
        userRepositry.save(loggedOutUser);
        return "Logout successful! Bye " + userName;
    }
}
