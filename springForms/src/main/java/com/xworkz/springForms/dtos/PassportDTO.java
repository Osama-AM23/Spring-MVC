package com.xworkz.springForms.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class PassportDTO {

    private String applyAt;
    private String passportOffice;
    private String fullName;
    private String surName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dob;
    private String email;
    private String loginIdSame;
    private String loginId;
    private String password;
    private String confirmPassword;
}
