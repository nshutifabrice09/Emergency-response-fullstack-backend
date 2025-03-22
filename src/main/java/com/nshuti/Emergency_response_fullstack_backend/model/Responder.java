package com.nshuti.Emergency_response_fullstack_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "responders")
public class Responder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long responderId;

    private String name;
    private String phone;

    @Enumerated(EnumType.STRING)
    private ResponderType type;

    private double latitude;
    private double longitude;

    private boolean available;

    public Responder() {
    }

    public Responder(Long responderId, String name, String phone, ResponderType type, double latitude, double longitude, boolean available) {
        this.responderId = responderId;
        this.name = name;
        this.phone = phone;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.available = available;
    }

    public Long getResponderId() {
        return responderId;
    }

    public void setResponderId(Long responderId) {
        this.responderId = responderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ResponderType getType() {
        return type;
    }

    public void setType(ResponderType type) {
        this.type = type;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
