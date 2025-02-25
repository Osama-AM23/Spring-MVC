package com.xworkz.trainBooking.controller;

import com.xworkz.trainBooking.dto.TrainBookingDto;
import com.xworkz.trainBooking.entity.TrainBookingEntity;
import com.xworkz.trainBooking.service.TrainBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class TrainBookingController {

    @Autowired
    TrainBookingService bookingService;

    @RequestMapping("bookTicket")
    public String booking(TrainBookingDto bookingDto) {
        bookingService.validateAndSave(bookingDto);
        return "Response.jsp";
    }

    @RequestMapping("getDetails")
    public String getDetails(Model model){
        List<TrainBookingDto> dtos =bookingService.getAll();
        System.out.println(dtos);
        model.addAttribute("list", dtos);
        return "GetAllDetails.jsp";
    }
    @RequestMapping("remove")
    public RedirectView deleteData(@RequestParam("id") int id , HttpServletRequest request){
        bookingService.removeData(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath()+"/getDetails");
        return redirectView;
    }
    @RequestMapping("editData")
    public String findData(@RequestParam("id") int id, Model model){
        TrainBookingEntity trainBooking =bookingService.findAll(id);
        model.addAttribute("value", trainBooking);
        return "Update.jsp";
    }
    @RequestMapping("updateTicket")
    public String updateData(TrainBookingDto bookingDto){
        bookingService.updateData(bookingDto);

        return "UpdateResponse.jsp";
    }
}
