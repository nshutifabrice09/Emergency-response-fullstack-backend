package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.Notification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImplementation implements NotificationService{

    @Override
    public Notification saveNotification(Notification notification, Long alertId, Long userId) {
        return null;
    }

    @Override
    public List<Notification> getAllNotifications() {
        return null;
    }

    @Override
    public Notification getNotificationById(Long notificationId) {
        return null;
    }

    @Override
    public Notification updateNotification(Long notificationId, Notification notification) {
        return null;
    }

    @Override
    public void removeById(Long notificationId) {

    }
}
