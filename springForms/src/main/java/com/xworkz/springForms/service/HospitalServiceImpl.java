package com.xworkz.springForms.service;

import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HosptalService{

    public HospitalServiceImpl(){
        System.out.println("No-Args Const of HospitalServiceImpl");
    }

    @Override
    public boolean validateAndApply() {
        System.out.println("Executing a ValidateAndApply in HospitalServiceImpl");
        return true;
    }
}
