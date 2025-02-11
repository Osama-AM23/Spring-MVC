package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Store {
    @Value("5201")
    private int storeId;
    @Value("PizzaHut")
    private String name;
    @Autowired
    private Manager manager;
}
