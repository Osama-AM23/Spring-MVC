package com.xworkz.springForms.components;

import com.xworkz.springForms.dtos.OrganDonationDTO;
import com.xworkz.springForms.service.OrganDonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
//@Component
@RequestMapping("/")
public class OrganDonation {
    @Autowired
    private OrganDonationService service;

    public OrganDonation(){
        System.out.println("No-Args Const of OrganDonation");
    }
    @RequestMapping("/donation")
    public String onApply(OrganDonationDTO dto){
        System.out.println("Executing a onApply in OrganDonation");
        System.out.println("Value :"+dto);
        boolean isSaved=service.validateAndSave();
        if(isSaved){
            System.out.println("Data is Saved");
        }else {
            System.out.println("Data is Not Saved");
        }
        return "OrganDonation.jsp";
    }
}

