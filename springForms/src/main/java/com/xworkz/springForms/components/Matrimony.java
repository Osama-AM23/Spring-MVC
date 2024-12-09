package com.xworkz.springForms.components;

import com.xworkz.springForms.dtos.MatrimonyDTO;
import com.xworkz.springForms.service.MatrimonyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
//@Component
@RequestMapping("/")
public class Matrimony {
    @Autowired
    private MatrimonyService service;

    public Matrimony(){
        System.out.println("No-Args Const of Matrimony");
    }

    @RequestMapping("/marry")
    public String onMarry(MatrimonyDTO dto){
        System.out.println("Executing onMarry in Matrominy");
        System.out.println("Value :"+dto);
        boolean isSaved=service.validateAndSubmit();
        if (isSaved){
            System.out.println("Data is Saved");
        }else {
            System.out.println("Data is Not Saved");
        }
        return "Matrimony.jsp";
    }
}
