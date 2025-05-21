package com.nshuti.Emergency_response_fullstack_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "responders")
@Getter
@Setter
public class Responder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;

    @Enumerated(EnumType.STRING)
    private ResponderType type;

    private double latitude;
    private double longitude;

    private boolean available;

}
