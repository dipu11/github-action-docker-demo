package com.example.docker.docker.controller;

import com.example.docker.docker.model.User;
import org.springframework.web.bind.annotation.*;


/**
 * Created by DIPU on 12/6/21
 */
@RestController
@RequestMapping("/api/user")
public class UserController {


    @PostMapping
    public User saveUser(@RequestBody User user)
    {
        return user;
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") Long userId)
    {
        return new User(1L, "dummy", "dummy", 25, "english");
    }

}
