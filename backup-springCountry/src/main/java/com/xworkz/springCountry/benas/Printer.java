package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Printer {
    @Value("HP Smart Tank 210")
    private String brand;
    @Value("8999")
    private double cost;
}
