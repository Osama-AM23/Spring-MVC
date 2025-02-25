package com.xworkz.userform.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserFormDto {

    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private Long contactNo;

    public UserFormDto(Integer id, String firstName, String lastName, String email, Long contactNo) {
    }
}
