package com.xworkz.sports.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.xworkz.sports.component")
@Configuration
public class SportsConfiguration {

    public SportsConfiguration(){
        System.out.println("No-Args constructor of SportsConfig");
    }
    @Bean
    public String teamName(){
        System.out.println("Configured a teamName");
        return "Tamil Nadu Hockey Team";
    }
    @Bean
    public double budget(){
        return 40000.0;
    }
    @Bean
    public String ownerName(){
        System.out.println("Configured a owner name");
        return "Tamil Nadu Cricket Association";
    }
    @Bean
    public double batCost(){
        System.out.println("Configured a batcost");
        return 4000.0;
    }
    @Bean
    public double ballCost(){
        System.out.println("Configured a ball cost");
        return 600.0;
    }
}
