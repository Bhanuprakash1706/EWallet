package com.example.services;

public class UserNotFoundException extends Exception{
    UserNotFoundException(){
        super("user not found");
    }
}
