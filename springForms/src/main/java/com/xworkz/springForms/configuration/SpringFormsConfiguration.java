package com.xworkz.springForms.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.springForms")
@EnableWebMvc
public class SpringFormsConfiguration {

    public SpringFormsConfiguration(){
        System.out.println("No-Args Const of SpringFormsConfiguration");
    }


}
