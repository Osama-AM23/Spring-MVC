package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Sim {

    @Value("10106")
    private int simId;
    @Value("Airtel")
    private String simCompany;
}
