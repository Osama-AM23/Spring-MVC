package com.xworkz.demoAnnotation.component;

import org.springframework.stereotype.Component;

@Component
public class Kerala implements India{

    public Kerala(){
        System.out.println("Const of Kerala");
    }
    @Override
    public void state() {
        System.out.println("Kerala is a state of India");
    }
}
