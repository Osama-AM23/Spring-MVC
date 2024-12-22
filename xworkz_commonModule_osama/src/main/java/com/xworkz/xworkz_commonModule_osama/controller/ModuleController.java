package com.xworkz.xworkz_commonModule_osama.controller;

import com.xworkz.xworkz_commonModule_osama.dto.SignupDTO;
import com.xworkz.xworkz_commonModule_osama.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ModuleController {
    @Autowired
    private SignupService service;

    public ModuleController() {
        System.out.println("No-Args Const of ModuleController");
    }

    @GetMapping("/signup")
    public String onSignup() {
        System.out.println("Displaying Signup Form");
        return "signup.jsp";
    }

    @PostMapping("/signup")
    public String onSignup(SignupDTO signupDTO) {
        System.out.println("Executing onSignup in Controller");
        boolean check = service.validateAndSave(signupDTO);
        if (check) {
            System.out.println("Data Entered");
        } else {
            System.out.println("Data Not Entered");
        }
        return "signup.jsp";
    }

    @GetMapping("/signin")
    public String onSignin() {
        System.out.println("Displaying Signup Form");
        return "signin.jsp";
    }

    @PostMapping("/signin")
    public String onSignin(@RequestParam String email,@RequestParam String password) {
        String ref = service.onSignin(email, password);
        if (ref != null) {
            return "Success.jsp";
        }
        return "PasswordUpdate.jsp";
    }

    @PostMapping("/updatePassword")
    public String onUpdatePassword(@RequestParam String email,@RequestParam String newPassword,@RequestParam String confirmPassword) {
        if (service.onUpdate(email, newPassword, confirmPassword)) {
            return "Success.jsp";
        }
        return "PasswordUpdate.jsp";
    }
}
