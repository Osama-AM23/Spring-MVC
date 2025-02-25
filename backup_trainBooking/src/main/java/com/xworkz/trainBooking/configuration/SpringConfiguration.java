package com.xworkz.trainBooking.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.trainBooking")
public class SpringConfiguration {

    public SpringConfiguration(){
        System.out.println("No-Args Const of Spring Configuration");
    }
}
