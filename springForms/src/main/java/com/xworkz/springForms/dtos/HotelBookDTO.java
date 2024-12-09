package com.xworkz.springForms.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HotelBookDTO {

    private String fullName;
    private String totalGuest;
    private String email;
    private String contact;
}
