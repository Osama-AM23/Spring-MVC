package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Lock {
    @Value("1010")
    private int lockId;
    @Value("Number Lock")
    private String lockType;
}
