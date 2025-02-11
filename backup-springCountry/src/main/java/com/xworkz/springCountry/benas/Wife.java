package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Wife {
    @Value("Her")
    private String name;
    @Value("Give Tarcel to Husband")
    private String occupation;
}
