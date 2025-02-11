package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class XeroxShop {
    @Value("5")
    private int shopId;
    @Value("Abdullah")
    private String ownerName;
    @Autowired
    private Printer printer;

}
