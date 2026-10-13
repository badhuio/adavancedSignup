package com.example.loginAdvanced.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
public class signupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean TermsAccepted;
    private String email;
    private String fullName;
    private String userName;
    private LocalDate dob;
    private String country;
    private String password;
    @Column(columnDefinition = "DATETIME(0)")
    private LocalDateTime joinDate;
}
