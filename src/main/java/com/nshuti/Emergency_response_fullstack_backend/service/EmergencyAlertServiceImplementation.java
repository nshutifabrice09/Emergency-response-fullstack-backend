package com.nshuti.Emergency_response_fullstack_backend.service;

import com.nshuti.Emergency_response_fullstack_backend.model.EmergencyAlert;
import com.nshuti.Emergency_response_fullstack_backend.model.Responder;
import com.nshuti.Emergency_response_fullstack_backend.model.User;
import com.nshuti.Emergency_response_fullstack_backend.repository.EmergencyAlertRepository;
import com.nshuti.Emergency_response_fullstack_backend.repository.ResponderRepository;
import com.nshuti.Emergency_response_fullstack_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmergencyAlertServiceImplementation implements EmergencyAlertService{

    private final EmergencyAlertRepository emergencyAlertRepository;
    private final UserRepository userRepository;
    private final ResponderRepository responderRepository;

    @Autowired
    public EmergencyAlertServiceImplementation(EmergencyAlertRepository emergencyAlertRepository, UserRepository userRepository, ResponderRepository responderRepository) {
        this.emergencyAlertRepository = emergencyAlertRepository;
        this.userRepository = userRepository;
        this.responderRepository = responderRepository;
    }

    @Override
    public EmergencyAlert saveAlert(EmergencyAlert emergencyAlert, Long userId, Long responderId) {
        User user = userRepository.findUserById(userId);
        Responder responder = responderRepository.findResponderById(responderId);
        emergencyAlert.setUser(user);
        emergencyAlert.setAssignedResponder(responder);
        return emergencyAlertRepository.save(emergencyAlert);
    }

    @Override
    public List<EmergencyAlert> getAllAlerts() {
        return emergencyAlertRepository.findAll();
    }

    @Override
    public EmergencyAlert getAlertById(Long id) {
        return emergencyAlertRepository.findEmergencyAlertById(id);
    }

    @Override
    public EmergencyAlert updateAlert(Long id, EmergencyAlert emergencyAlert) {
        EmergencyAlert existEmergencyAlert = emergencyAlertRepository.findEmergencyAlertById(id);
        if(existEmergencyAlert != null){
            existEmergencyAlert.setType(emergencyAlert.getType());
            existEmergencyAlert.setStatus(emergencyAlert.getStatus());
            existEmergencyAlert.setLatitude(emergencyAlert.getLatitude());
            existEmergencyAlert.setLongitude(emergencyAlert.getLongitude());
            return emergencyAlertRepository.save(existEmergencyAlert);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        emergencyAlertRepository.deleteById(id);
    }
}
