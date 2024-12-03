package com.xworkz.exampleIndex.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Component1 {

    public Component1(){
        System.out.println("Execute Component1 Const");
    }
    @RequestMapping("/submit")
    public String submit(){
        System.out.println("submit method in Component1");
        return "index.jsp";
    }
}
