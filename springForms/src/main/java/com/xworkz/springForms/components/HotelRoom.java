package com.xworkz.springForms.components;

import com.xworkz.springForms.dtos.HotelBookDTO;
import com.xworkz.springForms.service.HotelRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
//@Component
@RequestMapping("/")
public class HotelRoom {
@Autowired
    public HotelRoomService service;

    public HotelRoom(){
        System.out.println("No-Args Const of HotelRoom");
    }
    @RequestMapping("/booking")
    public String onBook(HotelBookDTO dto){
        System.out.println("Executing onBook in HotelRoom");
        System.out.println("Value :"+dto);
        boolean isSaved=service.checkAndBook();
        if(isSaved){
            System.out.println("Data is Saved");
        }else{
            System.out.println("Data is Not Saved");
        }
        return "HotelRoom.jsp";
    }

}
