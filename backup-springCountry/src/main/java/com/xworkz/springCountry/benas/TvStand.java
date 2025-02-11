package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class TvStand {
    @Value("80842")
    private int standId;
    @Value("Kodak")
    private String company;
}
