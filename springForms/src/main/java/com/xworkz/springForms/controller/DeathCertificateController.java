package com.xworkz.springForms.controller;

import com.xworkz.springForms.dtos.DeathCertificateDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DeathCertificateController {



    public DeathCertificateController(){
        System.out.println("No-Args Const of DeathCertificateController");
    }
    @RequestMapping("/death")
    public String onSave(DeathCertificateDTO dto){
        System.out.println("Executing a onSave in DeathCertificateController");
        System.out.println("Data :"+dto);
        return "DeathCertificate.jsp";
    }
}
