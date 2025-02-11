package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Teacher {
    @Value("COM2022KR")
    private String teacherCode;
    @Value("Kaliyarasi")
    private String teacherName;
}
