package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Camera {
    @Value("sony")
    private String brand;
    @Value("Sony-Alpha7")
    private String model;
}
