package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PG {

    public PG(){
        System.out.println("No-Args COnst of PG");
    }

    private String pgName;
    private int roomSharing;
    private double rent;

}
