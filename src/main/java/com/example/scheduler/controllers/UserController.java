package com.example.scheduler.controllers;
import com.example.scheduler.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController{
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
}
