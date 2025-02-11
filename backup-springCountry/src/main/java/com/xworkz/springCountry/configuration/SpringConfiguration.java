package com.xworkz.springCountry.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springCountry")
public class SpringConfiguration {

    public SpringConfiguration(){
        System.out.println("No-Args Const of SpringConfiguration");
    }
}
