package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Footwear {
    @Value("WoodLand")
    private String company;
    @Value("1963")
    private int artNo;
    @Value("Sandal")
    private String type;

    public Footwear(){
        System.out.println("No-Args Const of Footwear");
    }
}
