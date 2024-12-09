package com.xworkz.springForms.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class IndexComponent {

    public IndexComponent(){
        System.out.println("No-Args Const of Index Component");
    }
    @RequestMapping("/index")
    public String allForms(){
        System.out.println("Executing allForms in IndexComponent");
        return "index.jsp";
    }
}
