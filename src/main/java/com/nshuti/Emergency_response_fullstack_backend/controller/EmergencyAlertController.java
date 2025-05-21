package com.nshuti.Emergency_response_fullstack_backend.controller;

import com.nshuti.Emergency_response_fullstack_backend.exception.EmergencyAlertNotFoundException;
import com.nshuti.Emergency_response_fullstack_backend.model.EmergencyAlert;
import com.nshuti.Emergency_response_fullstack_backend.service.EmergencyAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alters")
public class EmergencyAlertController {

    private final EmergencyAlertService emergencyAlertService;

    @Autowired
    public EmergencyAlertController(EmergencyAlertService emergencyAlertService) {
        this.emergencyAlertService = emergencyAlertService;
    }

    @PostMapping("/emergencyAlert/{userId}/{responderId}")
    public EmergencyAlert save(@RequestBody EmergencyAlert emergencyAlert,
                               @PathVariable ("userId") Long userId,
                               @PathVariable ("responderId") Long responderId){
        return emergencyAlertService.saveAlert(emergencyAlert, userId, responderId);
    }

    @GetMapping("/emergencyAlerts")
    public List<EmergencyAlert> emergencyAlertList(){
        return emergencyAlertService.getAllAlerts();
    }

    @GetMapping("/emergencyAlert/{id}")
    public EmergencyAlert getEmergencyAlert(@PathVariable ("id") Long id){
        return emergencyAlertService.getAlertById(id);
    }

    @PutMapping("/update/emergencyAlert/{id}")
    public EmergencyAlert updateEmergencyAlert(@PathVariable ("id") Long id, @RequestBody EmergencyAlert emergencyAlert){
        return emergencyAlertService.updateAlert(id, emergencyAlert);
    }

    @DeleteMapping("/delete/emergencyAlert/{id}")
    public void remove(@PathVariable ("id") Long id){
        emergencyAlertService.deleteById(id);
    }
}
