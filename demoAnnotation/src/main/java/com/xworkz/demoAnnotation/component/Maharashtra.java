package com.xworkz.demoAnnotation.component;

import org.springframework.stereotype.Component;

@Component
public class Maharashtra implements India{

    public Maharashtra(){
        System.out.println("Const of Maharashtra");
    }
    @Override
    public void state() {
        System.out.println("Maharashtra is a state of India");
    }
}
