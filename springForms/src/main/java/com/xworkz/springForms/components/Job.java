package com.xworkz.springForms.components;

import com.xworkz.springForms.dtos.JobDTO;
import com.xworkz.springForms.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
//@Component
@RequestMapping("/")
public class Job {
    @Autowired
    private JobService service;

    public Job(){
        System.out.println("No-Args Const of Job");
    }
    @RequestMapping("/apply")
    public String onApplyJob(JobDTO dto){
        System.out.println("Executing onApplyJob in Job");
        System.out.println("Value "+dto);
        boolean isSaved=service.validateAndApply();
        if(isSaved){
            System.out.println("Data is Save Successfully");
        }else {
            System.out.println("Data is Not Save");
        }
        return "Job.jsp";
    }
}
