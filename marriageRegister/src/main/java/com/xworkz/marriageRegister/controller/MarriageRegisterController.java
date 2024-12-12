package com.xworkz.marriageRegister.controller;


import com.xworkz.marriageRegister.dto.MarriageRegisterDTO;
import com.xworkz.marriageRegister.service.MarriageRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MarriageRegisterController {
    @Autowired
    private MarriageRegisterService service;

    public MarriageRegisterController() {
        System.out.println("No-Args Const of MarriageRegisterController");
    }
    @GetMapping("/marriage")
    public String onRegister(){
        System.out.println("Getting Data");
        return "index.jsp";
    }

    @PostMapping("/marriage")
    public String onRegister(MarriageRegisterDTO dto) {
        System.out.println("VALUE: " + dto.toString());
        boolean check=service.onSave(dto);

        return "index.jsp";
    }
}
