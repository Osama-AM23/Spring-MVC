package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class HardDisk {
    @Value("12GB")
    private String capacity;
    @Value("3.5 inch")
    private String formFactory;
}
