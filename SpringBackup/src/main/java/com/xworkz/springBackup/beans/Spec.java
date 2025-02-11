package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Spec {

    @Value("Screen Glass")
    private String type;
    private String shape;
    private double prize;

    public Spec(@Value("Aviator") String shape, @Value("2000") double prize){
        this.shape= shape;
        this.prize= prize;
    }
}
