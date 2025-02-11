package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Camera {
    @Value("Nikon")
    private String company;
    private String model;


    public Camera(@Value("D5600") String model){
        this.model= model;
    }
}
