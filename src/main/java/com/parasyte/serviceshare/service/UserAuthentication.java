package com.parasyte.serviceshare.service;

import com.parasyte.serviceshare.dao.UserRepository;
import com.parasyte.serviceshare.exceptionhandler.UserCreationFailure;
import com.parasyte.serviceshare.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserAuthentication {
    //TODO: implement sso for user creation.
    @Autowired
    private UserRepository userRepository;
    public void checkIfExistingUser(String userName) throws UserCreationFailure {
       if(userRepository.findUserByName(userName)!=null){
           throw new UserCreationFailure("User "+userName+" already exists");
       }

    }
}
