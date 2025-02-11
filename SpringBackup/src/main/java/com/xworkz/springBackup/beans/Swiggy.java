package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Swiggy {

    public Swiggy(){
        System.out.println("No-Args Const of Swiggy");
    }

    private String productName;
    private int quantity;
    private String hotelName;
}
