package com.parasyte.serviceshare.controllers;

import com.parasyte.serviceshare.exceptionhandler.UserCreationFailure;
import com.parasyte.serviceshare.model.User;
import com.parasyte.serviceshare.dao.UserRepository;
import com.parasyte.serviceshare.service.UserAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository user;

    private UserAuthentication userAuthentication;

    //TODO: complete controllers
    @GetMapping("/finduser/{name}")
    public User finduser(@PathVariable String name){
        return finduser(name);
    }

    //TODO: password needs to be hashed and use a request body instead of path variables
    @PostMapping("/adduser/")
    public User addUser(@PathVariable String name,@PathVariable String email,@PathVariable String password) throws UserCreationFailure {
        userAuthentication.checkIfExistingUser(name);
        return null;
    }


}
