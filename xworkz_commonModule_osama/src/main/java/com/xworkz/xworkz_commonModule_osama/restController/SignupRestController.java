package com.xworkz.xworkz_commonModule_osama.restController;


import com.xworkz.xworkz_commonModule_osama.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/")
public class SignupRestController {

    @Autowired
    private SignupService service;

    public SignupRestController() {
        System.out.println("No-Args Const of SignupRestController");
    }
    @GetMapping(value = "/name/{userName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onName(@PathVariable String userName) {
        System.out.println(userName);
        Long check=service.getCountByName(userName);
        if(check ==0){
            System.out.println(" ");
            return "UserName Available";
        }
        return  "UserName Already Exist";
    }

    @GetMapping(value = "/userEmail/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onEmail(@PathVariable String email) {
        System.out.println(email);
        Long check=service.getCountByEmail(email);
        if(check ==0){
            System.out.println(" ");
            return "Email Available";
        }
        return  "Email Already Exist";

    }

    @GetMapping(value = "/userPhone/{phone}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onPhone(@PathVariable String phone) {
        System.out.println(phone);
        Long check=service.getCountByPhone(phone);
        if(check ==0){
            System.out.println(" ");
            return "Phone no Available";
        }
        return  "Phone No Already Exist";
    }

    @GetMapping(value = "/userAlterEmail/{alterEmail}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onAlterEmail(@PathVariable String alterEmail) {
        System.out.println(alterEmail);
       Long check=service.getCountByAlterEmail(alterEmail);
        if(check ==0){
            System.out.println(" ");
            return "Alter Email Available";
        }
        return  "Alter Email Already Exist";
    }

    @GetMapping(value = "/userAlterPhone/{alterPhone}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onAlterPhone(@PathVariable String alterPhone) {
        System.out.println(alterPhone);
        Long check=service.getCountByAlterPhone(alterPhone);
        if(check ==0){
            System.out.println(" ");
            return "Alter Phone No Available";
        }
        return  "Alter Phone No Already Exist";
    }
}
