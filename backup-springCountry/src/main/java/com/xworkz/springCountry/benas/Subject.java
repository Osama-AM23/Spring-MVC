package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Subject {
    @Value("j09v2")
    private String subjectCode;
    @Value("Data Scientist")
    private String subjectName;
    @Autowired
    private Teacher teacher;
}
