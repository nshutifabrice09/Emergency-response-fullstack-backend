package com.nshuti.Emergency_response_fullstack_backend.repository;

import com.nshuti.Emergency_response_fullstack_backend.model.EmergencyAlert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyAlertRepository extends JpaRepository <EmergencyAlert, Long> {

    EmergencyAlert findEmergencyAlertById(Long id);

}
