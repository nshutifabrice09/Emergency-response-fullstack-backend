package com.nshuti.Emergency_response_fullstack_backend.repository;

import com.nshuti.Emergency_response_fullstack_backend.model.Responder;
import com.nshuti.Emergency_response_fullstack_backend.model.ResponderType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResponderRepository extends JpaRepository <Responder, Long> {
    Responder findResponderById(Long responderId);
}
