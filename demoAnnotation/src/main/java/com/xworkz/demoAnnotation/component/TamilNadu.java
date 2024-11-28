package com.xworkz.demoAnnotation.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TamilNadu implements India{

    public TamilNadu(){
        System.out.println("Const of TamilNadu");
    }
    @PostConstruct
    @Override
    public void state() {
        System.out.println("Tamil Nadu is a state of India");
    }
}
