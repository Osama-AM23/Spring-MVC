package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Laptop {

    private String brand;
    private String model;
    private double price;

    @Autowired
    public Laptop(@Value("HP") String brand, @Value("14S") String model,@Value("48000") double price){
        this.brand= brand;
        this.model = model;
        this.price = price;
    }
}
