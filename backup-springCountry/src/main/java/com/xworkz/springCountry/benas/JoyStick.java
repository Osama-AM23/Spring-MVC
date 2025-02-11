package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class JoyStick {
    @Value("2.6")
    private double joyStickVersion;
    @Value("white")
    private String colors;


}
