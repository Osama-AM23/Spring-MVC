package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Mobile {

    @Value("vivo-T3")
    private String model;
    @Value("LCD-Display")
    private String display;
    @Autowired
    private Sim sim;
}
