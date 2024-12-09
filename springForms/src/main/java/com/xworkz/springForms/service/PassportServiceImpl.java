package com.xworkz.springForms.service;

import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService {

    public PassportServiceImpl(){
        System.out.println("No-Args Const of PassportServiceImpl");
    }

    @Override
    public boolean validateAndRegister() {
        System.out.println("Executing validateAndRegister in PassportServiceImpl");
        return true;
    }
}
