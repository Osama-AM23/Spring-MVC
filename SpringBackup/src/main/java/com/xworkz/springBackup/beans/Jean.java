package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Jean {

    @Value("Cargo")
    private String type;
    @Value("32")
    private int size;
    @Value("Cotton")
    private String fabric;

    public  Jean(){
        System.out.println("No-Args Const of Jean");
    }
}
