package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Manager {
    @Value("A23O09")
    private String managerId;
    @Value("Kiran")
    private String name;
    @Value("Diploma")
    private String qualification;
}
