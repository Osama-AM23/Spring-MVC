package com.xworkz.userform.controller;

import com.xworkz.userform.dto.UserFormDto;
import com.xworkz.userform.entity.UserFormEntity;
import com.xworkz.userform.service.UserFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserFormController {
    @Autowired
    UserFormService userFormService;

    public UserFormController() {
        System.out.println("No-Args Const of UserFormController");
    }

    // for save operation
    @PostMapping("userPage")
    public String getUserForm(UserFormDto userFormDto, Model model) {
        userFormService.validateAndSave(userFormDto);
        model.addAttribute("name",userFormDto.getFirstName());
        return "response.jsp";
    }

    // get all the details from DB
    @GetMapping("getAll")
    public String getAllDetails(Model model) {
        List<UserFormDto> dto = userFormService.getAll();
        System.out.println(dto);
        model.addAttribute("list", dto);
        return "getAllDetails.jsp";
    }

    // delete the user details
    @RequestMapping("deleteUser")
    public RedirectView deleteById(@RequestParam("id") String id, HttpServletRequest req){
        userFormService.deleteUserById(Integer.parseInt(id));
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(req.getContextPath() + "/getAll");
        return redirectView;
    }

    // getting the data from DB
    @RequestMapping("editUser")
    public String findById(@RequestParam("id") int id, Model model){
        UserFormDto userFormDto=userFormService.findById(id);
        System.out.println("Controller :"+userFormDto);
        model.addAttribute("item",userFormDto);
        return "updatePage.jsp";
    }

    // updating the data from frontend
    @RequestMapping("updateData")
    public String updateUser(UserFormDto dto, Model model){
        userFormService.updateUser(dto);
        model.addAttribute("name", dto.getFirstName());
        return "updateResponse.jsp";
    }
}
