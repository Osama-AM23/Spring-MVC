package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Phone {

    public Phone(){
        System.out.println("No-Args Const of Phone");
    }

    private String brand;
    private String model;
    private double price;

}
