package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Laptop {
    @Value("HP")
    private String brand;
    @Value("8")
    private int storage;
    @Autowired
    private HardDisk hardDisk;
}
