package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.Notification;
import com.nshuti.Emergency_response_fullstack_backend.repository.EmergencyAlertRepository;
import com.nshuti.Emergency_response_fullstack_backend.repository.NotificationRepository;
import com.nshuti.Emergency_response_fullstack_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImplementation implements NotificationService{

    private final NotificationRepository notificationRepository;
    private final EmergencyAlertRepository emergencyAlertRepository;
    private final UserRepository userRepository;

    @Autowired
    public NotificationServiceImplementation(NotificationRepository notificationRepository, EmergencyAlertRepository emergencyAlertRepository, UserRepository userRepository) {
        this.notificationRepository = notificationRepository;
        this.emergencyAlertRepository = emergencyAlertRepository;
        this.userRepository = userRepository;
    }


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
