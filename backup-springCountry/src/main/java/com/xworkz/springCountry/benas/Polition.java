package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Polition {

    @Value("001")
    private int id;
    @Value("Deepak")
    private String name;
}
