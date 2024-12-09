package com.xworkz.springForms.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BankAccountDTO {

    private String fullName;
    private String age;
    private long aadhaarNo;
    private long contact;

}
