package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Husband {
    @Value("Him")
    private String name;
    @Value("Data Scientist")
    private String occupation;
    @Autowired
    private Wife wife;
}
