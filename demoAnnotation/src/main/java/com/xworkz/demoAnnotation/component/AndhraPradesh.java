package com.xworkz.demoAnnotation.component;

import org.springframework.stereotype.Component;

@Component
public class AndhraPradesh implements India {

    public AndhraPradesh(){
        System.out.println("Const of AndhraPradesh");
    }

    @Override
    public void state() {
        System.out.println("Andhra Pradesh is a state of India");
    }
}
