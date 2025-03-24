package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.EmergencyAlert;

import java.util.List;

public interface EmergencyAlertService {
    EmergencyAlert saveAlert(EmergencyAlert emergencyAlert);
    List<EmergencyAlert> getAllAlerts();
    EmergencyAlert getAlertById(Long id);
    EmergencyAlert updateAlert(Long id, EmergencyAlert emergencyAlert);
    void deleteById(Long id);
}
