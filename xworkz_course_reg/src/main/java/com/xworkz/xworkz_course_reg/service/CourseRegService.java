package com.xworkz.xworkz_course_reg.service;

import com.xworkz.xworkz_course_reg.dto.CourseRegDTO;

public interface CourseRegService {

    public String validateAndSave(CourseRegDTO dto);

    String verificationUser(String email, String password);

    String getNameByEmail(String email);


}
