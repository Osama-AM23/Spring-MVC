package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Ingrediant {
    @Value("1")
    private int id;
    @Value("Sooji")
    private String name;
}
