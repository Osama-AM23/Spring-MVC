package com.xworkz.springForms.controller;

import com.xworkz.springForms.dtos.PassportDTO;
import com.xworkz.springForms.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PassportController {
    @Autowired
    private PassportService service;

    public PassportController(){
        System.out.println("No-Args Const of PassportController");
    }
    @RequestMapping("/passport")
    public String onRegister(PassportDTO dto){
        System.out.println("Executing a onRegister in PassportController");
        System.out.println("Values :"+dto);
        boolean isSaved=service.validateAndRegister();
        if(isSaved){
            System.out.println("Data is Saved");
        }else {
            System.out.println("Data is not Saved");
        }
        return "Passport.jsp";
    }
}
