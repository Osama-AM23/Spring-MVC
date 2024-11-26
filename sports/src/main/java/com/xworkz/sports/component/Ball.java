package com.xworkz.sports.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ball {
    @Autowired
    private double ballCost;

    public Ball(){
        System.out.println("No-Args constructor of Ball");
    }
}
