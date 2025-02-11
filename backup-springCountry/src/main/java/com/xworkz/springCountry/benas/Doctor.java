package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Doctor {
    @Value("1998AW23")
    private String doctorCode;
    @Value("Aswin")
    private String name;



}
