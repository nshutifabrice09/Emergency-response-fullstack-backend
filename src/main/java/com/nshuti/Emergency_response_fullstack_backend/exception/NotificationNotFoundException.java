package com.nshuti.Emergency_response_fullstack_backend.exception;

public class NotificationNotFoundException extends RuntimeException{
    public NotificationNotFoundException(Long notificationId){
        super ("Couldn't find the notification id " +notificationId);
    }
}
