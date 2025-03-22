package com.nshuti.Emergency_response_fullstack_backend.repository;

import com.nshuti.Emergency_response_fullstack_backend.model.EmergencyAlert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmergencyAlertRepository extends JpaRepository <EmergencyAlert, Long> {

}
