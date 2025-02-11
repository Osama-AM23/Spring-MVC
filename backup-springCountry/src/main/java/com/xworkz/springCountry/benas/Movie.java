package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Movie {
    @Value("1010456")
    private int movieId;
    @Value("KGF")
    private String movieName;
}
