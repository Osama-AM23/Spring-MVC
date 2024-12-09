package com.xworkz.springForms.service;

import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService{

    public JobServiceImpl(){
        System.out.println("No-Args Const of JobServiceImpl");
    }
    @Override
    public boolean validateAndApply() {
        System.out.println("Executing a ValidateAndApply in JobServiceImpl");
        return true;
    }
}
