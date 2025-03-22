package com.nshuti.Emergency_response_fullstack_backend.repository;

import com.nshuti.Emergency_response_fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Long>{
}
