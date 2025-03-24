package com.nshuti.Emergency_response_fullstack_backend.exception;

public class EmergencyAlertNotFoundException extends RuntimeException{

    public EmergencyAlertNotFoundException (Long id){
        super("Could not find the Alert with id " +id);
    }

}
