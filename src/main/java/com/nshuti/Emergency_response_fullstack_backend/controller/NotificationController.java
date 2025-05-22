package com.nshuti.Emergency_response_fullstack_backend.controller;

import com.nshuti.Emergency_response_fullstack_backend.model.Notification;
import com.nshuti.Emergency_response_fullstack_backend.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/notification/{responderId}/{alertId}")
    public Notification save(@RequestBody Notification notification,
                             @PathVariable ("responderId") Long responderId,
                             @PathVariable ("alertId") Long alertId){
        return notificationService.saveNotification(notification, responderId, alertId);
    }

}
