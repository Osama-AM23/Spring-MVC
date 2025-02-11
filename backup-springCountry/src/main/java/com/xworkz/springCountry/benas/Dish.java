package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Dish {
    @Value("Uppit")
    private String dishName;
    @Value("15 Mins")
    private String prepataionTime;
    @Autowired
    private Ingrediant ingrediant;
}
