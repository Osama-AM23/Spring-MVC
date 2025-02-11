package com.xworkz.springBackup.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class TNPSCExam {
    @Value("18")
    private int age;
    private String candidteName;
    private String district;

    public TNPSCExam(@Value("Aswin") String candidteName, @Value("Dharmapuri") String district){
        this.candidteName= candidteName;
        this.district= district;
    }
}
