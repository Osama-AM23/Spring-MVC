package com.xworkz.springForms.service;

import org.springframework.stereotype.Service;

@Service
public class MatrimonyServiceImpl implements MatrimonyService{

    public MatrimonyServiceImpl(){
        System.out.println("No-Args Const of MatrimonyServiceImpl");
    }

    @Override
    public boolean validateAndSubmit() {
        System.out.println("Executing a ValidateAndSubmit in MatrimonyServiceImpl");
        return true;
    }
}
