package com.parasyte.serviceshare.exceptionhandler;

public class UserCreationFailure extends Exception{

    public UserCreationFailure(String message){
        super(message);
    }
}
