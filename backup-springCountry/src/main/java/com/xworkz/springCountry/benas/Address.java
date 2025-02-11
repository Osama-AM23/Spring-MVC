package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Address {
    @Value("54")
    private int doorNo;
    @Value("RajajiNagar")
    private String streetName;
}
