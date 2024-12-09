package com.xworkz.springForms.controller;

import com.xworkz.springForms.dtos.HospitalDTO;
import com.xworkz.springForms.service.HosptalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HospitalController {

    private HosptalService service;

    public HospitalController(){
        System.out.println("No-Args Const of HospitalController");
    }

    @RequestMapping("/hospital")
    public String onApply(HospitalDTO dto){
        System.out.println("Executing a onApply in HospitalController");
        System.out.println("Value :"+dto);
        boolean isSave=service.validateAndApply();
        if (isSave){
            System.out.println("Data is saved");
        }else {
            System.out.println("Data is not Saved");
        }
        return "Hospital.jsp";
    }
}
