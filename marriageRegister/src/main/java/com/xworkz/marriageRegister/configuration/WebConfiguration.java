package com.xworkz.marriageRegister.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.marriageRegister")
@EnableWebMvc

public class WebConfiguration {

    public WebConfiguration(){
        System.out.println("No-Args Const Of WebConfiguration");
    }
}
