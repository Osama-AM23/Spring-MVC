package com.xworkz.demoAnnotation.component;

import org.springframework.stereotype.Component;

@Component
public class Telangana implements India{

    public Telangana(){
        System.out.println("Const of Telangana");
    }
    @Override
    public void state() {
        System.out.println("Telangana is a state of India");
    }
}
