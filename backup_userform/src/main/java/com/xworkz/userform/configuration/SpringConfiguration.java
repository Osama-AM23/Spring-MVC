package com.xworkz.userform.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.userform")
public class SpringConfiguration {

    public SpringConfiguration(){
        System.out.println("No-Args Const of SpringConfiguration");
    }
}
