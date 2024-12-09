package com.xworkz.springForms.service;

import org.springframework.stereotype.Service;

@Service
public class ScholarshipServiceImpl implements ScholarshipService{

    public ScholarshipServiceImpl(){
        System.out.println("No-Args Const of ScholarshipServiceImpl");
    }
    @Override
    public boolean ValidateAndSend() {
        System.out.println("Executing ValidateAndSend in ScholarshipServiceImpl");
        return true;
    }
}
