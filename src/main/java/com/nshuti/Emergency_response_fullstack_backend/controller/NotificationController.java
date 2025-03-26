package com.nshuti.Emergency_response_fullstack_backend.controller;

import com.nshuti.Emergency_response_fullstack_backend.exception.NotificationNotFoundException;
import com.nshuti.Emergency_response_fullstack_backend.model.Notification;
import com.nshuti.Emergency_response_fullstack_backend.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NotificationController {

    @Autowired
    private NotificationRepository notificationRepository;

    @PostMapping("/register/notification")
    Notification newNotification(@RequestBody Notification newNotification){
        return notificationRepository.save(newNotification);
    }

    @GetMapping("/list/notification")
    List<Notification> getAllNotifications(){
        return notificationRepository.findAll();
    }

    @GetMapping("/find/notifications/{notificationId}")
    Notification getNotificationById(@PathVariable Long notificationId){
        return notificationRepository.findById(notificationId)
                .orElseThrow(()-> new NotificationNotFoundException(notificationId));
    }

    @PutMapping("/edit/notification/{notificationId}")
    Notification updateNotification (@RequestBody Notification newNotification, @PathVariable Long notificationId){
        return notificationRepository.findById(notificationId)
                .map(notification -> {
                    notification.setNotificationId(newNotification.getNotificationId());
                    notification.setResponder(newNotification.getResponder());
                    notification.setAlert(newNotification.getAlert());
                    notification.setStatus(newNotification.getStatus());
                    notification.setSentAt(newNotification.getSentAt());
                    return notificationRepository.save(newNotification);
                }).orElseThrow(()-> new NotificationNotFoundException(notificationId) );
    }

    @DeleteMapping("/delete/notification/{notificationId}")
    String DeleteNotification (@PathVariable Long notificationId){
        if(!notificationRepository.existsById(notificationId)){
            throw new NotificationNotFoundException(notificationId);
        }
        notificationRepository.deleteById(notificationId);
        return "Booking with id "+notificationId+" has been deleted successfully.";
    }
}
