package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Shirt {

    public Shirt(){
        System.out.println("No-Args Const of Shirt");
    }

    private String brand;
    private char size;
    private String fabric;

}
