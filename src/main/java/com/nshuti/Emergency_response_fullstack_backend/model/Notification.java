package com.nshuti.Emergency_response_fullstack_backend.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;

    @ManyToOne
    @JoinColumn(name = "responderId", nullable = false)
    private Responder responder;

    @ManyToOne
    @JoinColumn(name = "alertId", nullable = false)
    private EmergencyAlert alert;

    private String status;
    private LocalDateTime sentAt;

    public Notification() {
    }

    public Notification(Long notificationId, Responder responder, EmergencyAlert alert, String status, LocalDateTime sentAt) {
        this.notificationId = notificationId;
        this.responder = responder;
        this.alert = alert;
        this.status = status;
        this.sentAt = sentAt;
    }

    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public Responder getResponder() {
        return responder;
    }

    public void setResponder(Responder responder) {
        this.responder = responder;
    }

    public EmergencyAlert getAlert() {
        return alert;
    }

    public void setAlert(EmergencyAlert alert) {
        this.alert = alert;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }
}
