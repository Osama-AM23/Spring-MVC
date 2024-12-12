package com.xworkz.marriageRegister.dto;

import lombok.*;

@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class MarriageRegisterDTO {

    private int id;

    private String brideName;

    private String groomName;

    public MarriageRegisterDTO(String brideName, String groomName) {
        this.brideName = brideName;
        this.groomName = groomName;
    }
}
