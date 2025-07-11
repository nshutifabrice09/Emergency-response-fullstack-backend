package com.nshuti.Emergency_response_fullstack_backend.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="emergencyAlerts")
@Getter
@Setter
@Data
public class EmergencyAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    private String type;
    private String status;
    private double latitude;
    private double longitude;

    @ManyToOne
    @JoinColumn(name = "responderId")
    private Responder assignedResponder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Responder getAssignedResponder() {
        return assignedResponder;
    }

    public void setAssignedResponder(Responder assignedResponder) {
        this.assignedResponder = assignedResponder;
    }
}
