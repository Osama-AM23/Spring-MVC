package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Country {
    @Value("1")
    private int id;
    @Value("India")
    private String name;
    @Value("29")
    private int noOfStates;
    @Autowired
    private Polition polition;
}
