package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Theatre {
    @Value("2211")
    private int theaterId;
    @Value("Cinepolis")
    private String name;
    @Autowired
    private Movie movie;
}
