package com.xworkz.demoAnnotation.component;

import org.springframework.stereotype.Component;

@Component
public class Sikkim implements India {

    public Sikkim(){
        System.out.println("Const of Sikkim");
    }

    @Override
    public void state() {
        System.out.println("Sikkim is a state of India");
    }
}
