package com.nshuti.Emergency_response_fullstack_backend.dto;

public class EmergencyRequest {

    private String description;

    private String location;

    public EmergencyRequest() {

    }

    public EmergencyRequest(String description, String location) {
        this.description = description;
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}