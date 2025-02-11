package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class House {
    @Value("Azees")
    private String houseOwner;
    @Value("3000 sq ft.")
    private String landSize;
    @Autowired
    private Room room;
}
