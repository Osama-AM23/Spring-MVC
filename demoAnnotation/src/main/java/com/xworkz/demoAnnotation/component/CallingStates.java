package com.xworkz.demoAnnotation.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@PropertySource("classpath:persist.properties")
public class CallingStates {

    @Qualifier("TamilNadu")
    private India india;

    @Autowired
    private Meghalaya meghalaya;

    @Value("${dbusername}")
    private String username;

    @Value("${password}")
    private String password;

    public CallingStates(){
        System.out.println("Const of CallingStates");
    }

    public CallingStates(String username, String password){
        this.username=username;
        this.password=password;
    }
    @PostConstruct
    public void display(){
        System.out.println(this.username=username);
        System.out.println(this.password=password);
    }
}
