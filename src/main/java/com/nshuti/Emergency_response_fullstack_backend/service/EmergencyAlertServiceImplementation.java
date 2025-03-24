package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.EmergencyAlert;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmergencyAlertServiceImplementation implements EmergencyAlertService{
    @Override
    public EmergencyAlert saveAlert(EmergencyAlert emergencyAlert) {
        return null;
    }

    @Override
    public List<EmergencyAlert> getAllAlerts() {
        return null;
    }

    @Override
    public EmergencyAlert getAlertById(Long id) {
        return null;
    }

    @Override
    public EmergencyAlert updateAlert(Long id, EmergencyAlert emergencyAlert) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
