package com.xworkz.springBackup.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.xworkz.springBackup")
public class SpringConfiguration {
    public SpringConfiguration(){
        System.out.println("No-Args Const of SpringConfiguration");
    }

}
