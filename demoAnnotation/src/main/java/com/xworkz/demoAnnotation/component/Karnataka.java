package com.xworkz.demoAnnotation.component;

import org.springframework.stereotype.Component;

@Component
public class Karnataka implements India{

    public Karnataka(){
        System.out.println("Const of Karnataka");
    }
    @Override
    public void state() {
        System.out.println("Karnataka is a state of India");
    }
}
