package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.EmergencyAlert;
import com.nshuti.Emergency_response_fullstack_backend.model.Notification;
import com.nshuti.Emergency_response_fullstack_backend.model.Responder;
import com.nshuti.Emergency_response_fullstack_backend.repository.EmergencyAlertRepository;
import com.nshuti.Emergency_response_fullstack_backend.repository.NotificationRepository;
import com.nshuti.Emergency_response_fullstack_backend.repository.ResponderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImplementation implements NotificationService{

    private final NotificationRepository notificationRepository;
    private final EmergencyAlertRepository emergencyAlertRepository;
    private final ResponderRepository responderRepository;

    @Autowired
    public NotificationServiceImplementation(NotificationRepository notificationRepository, EmergencyAlertRepository emergencyAlertRepository, ResponderRepository responderRepository) {
        this.notificationRepository = notificationRepository;
        this.emergencyAlertRepository = emergencyAlertRepository;
        this.responderRepository = responderRepository;
    }


    @Override
    public Notification saveNotification(Notification notification, Long alertId, Long responderId) {
        EmergencyAlert emergencyAlert = emergencyAlertRepository.findEmergencyAlertById(alertId);
        Responder responder = responderRepository.findResponderById(responderId);
        notification.setAlert(emergencyAlert);
        notification.setResponder(responder);
        return notificationRepository.save(notification);
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
