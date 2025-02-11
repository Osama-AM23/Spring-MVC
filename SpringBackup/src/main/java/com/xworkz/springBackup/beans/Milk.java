package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Milk {

    public Milk(){
        System.out.println("No-Args Const of Milk");
    }

    private String company;
    private double quantity;
    private double price;

}
