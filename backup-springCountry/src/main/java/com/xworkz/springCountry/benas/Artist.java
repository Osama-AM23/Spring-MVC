package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Artist {
    @Value("Sai Abhyankkar")
    private String name;
    @Value("20")
    private int age;
}
