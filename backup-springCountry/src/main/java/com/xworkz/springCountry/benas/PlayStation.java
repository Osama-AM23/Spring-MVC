package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class PlayStation {
    @Value("2")
    private int version;
    @Value("Sony")
    private String brand;
    @Autowired
    private JoyStick joyStick;
}
