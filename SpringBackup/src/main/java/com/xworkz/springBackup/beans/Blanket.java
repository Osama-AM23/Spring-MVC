package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Blanket {

    private String material;
    private String size;
    private String pattern;
    private double price;

    @Autowired
    public Blanket(@Value("Wool") String material, @Value("twin")String size, @Value("Floral") String pattern, @Value("1200") double price){
        this.material= material;
        this.size= size;
        this.pattern= pattern;
        this.price= price;
    }
}
