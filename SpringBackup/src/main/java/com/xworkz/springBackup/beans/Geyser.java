package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Geyser {

    public Geyser(){
        System.out.println("No-Args const of Geyser");
    }

    private int modelNo;
    private String brandName;
    private double price;

}
