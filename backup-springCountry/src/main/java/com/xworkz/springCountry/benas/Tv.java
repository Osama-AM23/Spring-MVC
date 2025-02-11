package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Tv {
    @Value("Panasonic")
    private String tvModel;
    @Value("40000")
    private double price;
    @Autowired
    private TvStand tvStand;
}
