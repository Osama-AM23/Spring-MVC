package com.xworkz.xworkz_course_reg.repository;

import com.xworkz.xworkz_course_reg.entity.CourseRegEntity;

public interface CourseRegRepository {

    public boolean onSend(CourseRegEntity entity);

    CourseRegEntity findByEmail(String email);


}
