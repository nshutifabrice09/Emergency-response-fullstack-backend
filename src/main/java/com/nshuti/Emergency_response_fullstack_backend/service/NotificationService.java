package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.Notification;
import java.util.List;


public interface NotificationService {
    Notification saveNotification(Notification notification, Long alertId, Long responderId);
    List<Notification> getAllNotifications();
    Notification getNotificationById(Long notificationId);
    Notification updateNotification(Long notificationId, Notification notification);
    void removeById(Long notificationId);
}
