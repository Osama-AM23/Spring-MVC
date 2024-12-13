package com.xworkz.xworkz_admin_details.controller;

import com.xworkz.xworkz_admin_details.dto.AdminDetailsDTO;
import com.xworkz.xworkz_admin_details.service.AdminDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminDetailsController {

    @Autowired
    private AdminDetailsService service;

    public AdminDetailsController() {
        System.out.println("No-Args Const of AdminDetailsController");
    }

//    @GetMapping("/details")
//    public String onSubmit() {
//        System.out.println("Getting data");
//        return "Login.jsp";
//    }


    @PostMapping("/details")
    public String onSubmit(AdminDetailsDTO dto) {
        System.out.println("Executing a onSubmit in AdminDetailsController");
        System.out.println("VALUE :"+dto);
        boolean send=service.validateAndLogin(dto);
        if (send){
            return "Success.jsp";
        }

        return "index.jsp";
    }
}
