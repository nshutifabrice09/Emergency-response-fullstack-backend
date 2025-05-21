package com.nshuti.Emergency_response_fullstack_backend.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="emergencyAlerts")
@Getter
@Setter
@Data
public class EmergencyAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    private String type;
    private String status;
    private double latitude;
    private double longitude;

    @ManyToOne
    @JoinColumn(name = "responderId")
    private Responder assignedResponder;


}
