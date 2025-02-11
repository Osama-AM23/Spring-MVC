package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Lens {
    @Value("Zeiss")
    private String brand;
    @Value("85.3")
    private double focalLength;
    @Value("prime")
    private String lensType;
    @Autowired
    private Camera camera;
}
