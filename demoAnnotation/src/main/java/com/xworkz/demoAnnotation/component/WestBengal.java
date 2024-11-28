package com.xworkz.demoAnnotation.component;

import org.springframework.stereotype.Component;

@Component
public class WestBengal implements India{
    public WestBengal(){
        System.out.println("Const of WestBengal");
    }
    @Override
    public void state() {
        System.out.println("WestBengal is a state of India");

    }
}
