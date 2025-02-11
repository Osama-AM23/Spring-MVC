package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ToothPaste {

    public ToothPaste(){
        System.out.println("No-Args Const of ToothPaste");
    }

    private int productNo;
    private String productName;
    private double price;

}
