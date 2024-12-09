package com.xworkz.springForms.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JobDTO {

    private String fullName;
    private String dob;
    private String email;
    private String contact;
    private String qualification;
    private String experience;
    private String skills;
    private String address;

}
