package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Battery {
    @Value("ZX1PCV")
    private String batteryId;
    @Value("Exide")
    private String companyName;
    @Value("4 Years")
    private String warranty;
}
