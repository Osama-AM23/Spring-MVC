package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Music {
    @Value("Aasa Kooda")
    private String musicName;
    @Value("3:35")
    private String duration;
    @Autowired
    private Artist artist;
}
