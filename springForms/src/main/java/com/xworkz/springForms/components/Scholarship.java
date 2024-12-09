package com.xworkz.springForms.components;

import com.xworkz.springForms.dtos.ScholarshipDTO;
import com.xworkz.springForms.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
//@Component
@RequestMapping("/")
public class Scholarship {
    @Autowired
    private ScholarshipService service;

    public Scholarship(){
        System.out.println("No-Args of Scholarship");
    }
    @RequestMapping("/scholar")
    public String onBookScholarship(ScholarshipDTO dto){
        System.out.println("Execute Scholarship jsp ");
        System.out.println("Value :"+ dto);
        boolean isSaved=service.ValidateAndSend();
        if(isSaved){
            System.out.println("Data is Saved Successfully");
        }else{
            System.out.println("Data is Not Saved");
        }
        return "Scholarship.jsp";

    }
}
