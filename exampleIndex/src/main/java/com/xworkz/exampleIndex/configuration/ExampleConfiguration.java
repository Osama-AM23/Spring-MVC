package com.xworkz.exampleIndex.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.exampleIndex")
@EnableWebMvc
public class ExampleConfiguration {

    public ExampleConfiguration(){
        System.out.println("Execute ExampleConfiguration");
    }


}
