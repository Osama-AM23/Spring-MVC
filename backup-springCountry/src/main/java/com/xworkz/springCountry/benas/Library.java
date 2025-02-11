package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Library {

    @Value("001")
    private int libId;
    @Value("City Central Library")
    private String libName;
    @Autowired
    private Book book;

}
