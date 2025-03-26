package com.nshuti.Emergency_response_fullstack_backend.dto;

public class EmergencyResponse {
    private Long id;
    private String description;
    private String location;
    private String status;

    public EmergencyResponse() {
    }

    public EmergencyResponse(Long id, String description, String location, String status) {
        this.id = id;
        this.description = description;
        this.location = location;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }
}

