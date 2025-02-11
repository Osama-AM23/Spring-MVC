package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Hospital {
    @Value("2RAJI09BAN")
    private String hospitalCode;
    @Value("Altaums Clinic")
    private String hospitalName;
    @Value("54N, RajajiNagar, Bangalore")
    private String address;
    @Autowired
    private Doctor doctor;
}
