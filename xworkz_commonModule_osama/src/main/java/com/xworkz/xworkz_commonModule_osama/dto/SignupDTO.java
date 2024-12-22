package com.xworkz.xworkz_commonModule_osama.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignupDTO {

    private String userName;

    private String email;

    private String phone;

    private String alterEmail;

    private String alterPhone;

    private String location;


}
