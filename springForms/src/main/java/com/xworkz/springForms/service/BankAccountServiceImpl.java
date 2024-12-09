package com.xworkz.springForms.service;

import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService{

    public BankAccountServiceImpl(){
        System.out.println("No-Args Const of BankAccountServiceImpl");
    }
    @Override
    public boolean validateAndCreate() {
        System.out.println("Executing a validateAndCreate in BankAccountServiceImpl");
        return true;
    }
}
