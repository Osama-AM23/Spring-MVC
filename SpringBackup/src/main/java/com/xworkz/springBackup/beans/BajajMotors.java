package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BajajMotors {

    public BajajMotors(){
        System.out.println("No-Args Const of BajajMotors");
    }

    private String name;
    private String model;
    private int releasedYear;

}
