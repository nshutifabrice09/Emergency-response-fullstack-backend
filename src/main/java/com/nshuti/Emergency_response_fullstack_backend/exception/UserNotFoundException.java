package com.nshuti.Emergency_response_fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long userId){
        super("Could not find the booking with id " +userId);
    }
}
