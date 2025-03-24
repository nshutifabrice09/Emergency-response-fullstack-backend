package com.nshuti.Emergency_response_fullstack_backend.controller;

import com.nshuti.Emergency_response_fullstack_backend.exception.EmergencyAlertNotFoundAdvice;
import com.nshuti.Emergency_response_fullstack_backend.exception.EmergencyAlertNotFoundException;
import com.nshuti.Emergency_response_fullstack_backend.model.EmergencyAlert;
import com.nshuti.Emergency_response_fullstack_backend.repository.EmergencyAlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alters")
public class EmergencyAlertController {

    @Autowired
    private EmergencyAlertRepository emergencyAlertRepository;

    @PostMapping("/register/alert")
    EmergencyAlert newAlert(@RequestBody EmergencyAlert newAlert){
        return emergencyAlertRepository.save(newAlert);
    }

    @GetMapping("/list/alerts")
    List<EmergencyAlert> getAllAlerts(){
        return emergencyAlertRepository.findAll();
    }

    @GetMapping("/find/alerts/{id}")
    EmergencyAlert updateAlert (@RequestBody EmergencyAlert newAlert, @PathVariable Long id){
        return emergencyAlertRepository.findById(id)
                .map(emergencyAlert -> {
                    emergencyAlert.setUser(newAlert.getUser());
                    emergencyAlert.setType(newAlert.getType());
                    emergencyAlert.setStatus(newAlert.getStatus());
                    emergencyAlert.setLatitude(newAlert.getLatitude());
                    emergencyAlert.setLongitude(newAlert.getLongitude());
                    emergencyAlert.setAssignedResponder(newAlert.getAssignedResponder());
                    return emergencyAlertRepository.save(emergencyAlert);
                }).orElseThrow(()-> new EmergencyAlertNotFoundException(id));
    }

    @DeleteMapping("/delete/alerts/{id}")
    String deleteUser (@PathVariable Long id){
        if(!emergencyAlertRepository.existsById(id)){
            throw new EmergencyAlertNotFoundException(id);
        }
        emergencyAlertRepository.deleteById(id);
        return "User with id "+id+" has been deleted successfully";
    }
}
