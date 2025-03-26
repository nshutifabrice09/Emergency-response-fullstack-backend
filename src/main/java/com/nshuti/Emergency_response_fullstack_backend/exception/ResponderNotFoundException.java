package com.nshuti.Emergency_response_fullstack_backend.exception;

public class ResponderNotFoundException extends RuntimeException{
    public ResponderNotFoundException(Long responderId){
        super("Couldn't find the responder with id " +responderId);
    }
}
