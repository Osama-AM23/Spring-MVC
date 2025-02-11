package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class YouTube {

    public YouTube(){
        System.out.println("No-Args Const of YouTube");
    }

    private String channel;
    private int subscriber;
    private String owner;
}
