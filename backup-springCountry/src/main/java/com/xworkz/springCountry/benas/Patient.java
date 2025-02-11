package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Patient {

    @Value("1")
    private int id;
    @Value("narander")
    private String patientName;
    @Autowired
    private Address address;
}
