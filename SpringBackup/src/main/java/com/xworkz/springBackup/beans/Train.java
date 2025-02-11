package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Train {

    public Train(){
        System.out.println("No-Args Const of Train");
    }

    private String source;
    private String destination;
    private double fare;
}
