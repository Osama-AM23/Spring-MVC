package com.xworkz.springForms.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeathCertificateDTO {

    private String deceasedName;
    private int deceasedAge;
    private String deceasedAddress;
    private String deceasedDob;
    private String deceasedLasteDate;
    private String causeOfDeath;
}
