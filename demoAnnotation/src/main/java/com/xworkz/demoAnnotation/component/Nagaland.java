package com.xworkz.demoAnnotation.component;

import org.springframework.stereotype.Component;

@Component
public class Nagaland implements India {
    public Nagaland(){
        System.out.println("Const of Nagaland");
    }
    @Override
    public void state() {
        System.out.println("Nagaland is a state of India");
    }
}
