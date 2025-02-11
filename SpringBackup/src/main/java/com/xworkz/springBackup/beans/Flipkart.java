package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Flipkart {

    private String productName;
    private double price;
    @Value("Rajajinagar, Bangalore")
    private String deliveryAddress;

    public Flipkart(@Value("Viking-InnerWear") String productName,@Value("300")double price){
        this.productName= productName;
        this.price= price;
    }


}
