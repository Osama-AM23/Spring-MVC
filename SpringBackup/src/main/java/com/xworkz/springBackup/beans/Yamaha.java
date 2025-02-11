package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Yamaha {

    public Yamaha(){
        System.out.println("No-Args Const of Yamaha");
    }

    private int version;
    private String name;
    private double price;
}
