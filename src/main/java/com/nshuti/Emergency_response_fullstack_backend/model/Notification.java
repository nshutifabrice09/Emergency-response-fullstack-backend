package com.nshuti.Emergency_response_fullstack_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "notifications")
@Getter
@Setter
@Data
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "responderId", nullable = false)
    private Responder responder;

    @ManyToOne
    @JoinColumn(name = "alertId", nullable = false)
    private EmergencyAlert alert;

    private String status;
    private LocalDateTime sentAt;


}
