package com.xworkz.demoAnnotation.component;

import org.springframework.stereotype.Component;

@Component
public class Meghalaya implements India{

    public Meghalaya(){
        System.out.println("Const of Meghalaya");
    }
    @Override
    public void state() {
        System.out.println("Meghalaya is a state of India");

    }
}
