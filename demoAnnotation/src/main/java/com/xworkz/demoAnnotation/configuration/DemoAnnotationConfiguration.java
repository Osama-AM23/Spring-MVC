package com.xworkz.demoAnnotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.xworkz.demoAnnotation")
@Configuration

public class DemoAnnotationConfiguration {

    public DemoAnnotationConfiguration(){
        System.out.println("No-Args Const of Demo Configuration Class");
    }

}
