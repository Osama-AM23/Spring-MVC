package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Ups {
    @Value("355465")
    private int upsId;
    @Value("Zebronic")
    private String company;
    @Autowired
    private Battery battery;
}
