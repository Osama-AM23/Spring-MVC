package com.xworkz.springForms.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HospitalDTO {

    private String fullName;
    private int age;
    private String problem;
    private String address;
    private long contact;

}
