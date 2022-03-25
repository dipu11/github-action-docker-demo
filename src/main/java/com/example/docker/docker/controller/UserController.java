package com.example.docker.docker.controller;

import com.example.docker.docker.model.User;
import com.example.docker.docker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by DIPU on 12/6/21
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User saveUser(@RequestBody User user)
    {
        user=userRepository.save(user);
        return user;
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") Long userId)
    {
        Optional<User> user= userRepository.findById(userId);

        return user.isPresent()? user.get(): null;
    }

}
