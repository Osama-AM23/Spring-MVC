package com.xworkz.springForms.controller;

import com.xworkz.springForms.dtos.BankAccountDTO;
import com.xworkz.springForms.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankAccountController {
    @Autowired
    private BankAccountService service;

    public BankAccountController(){
        System.out.println("No-Args Const of BankAccountController");
    }
    @RequestMapping("/bank")
    public String onCreate(BankAccountDTO dto){
        System.out.println("Executing a onCreate in BankAccountController");
        System.out.println("Value:"+dto);
        boolean isSaved=service.validateAndCreate();
        if(isSaved){
            System.out.println("Data is Saved");
        }else{
            System.out.println("Data is Not Saved");
        }
        return "BankAccount.jsp";
    }
}
