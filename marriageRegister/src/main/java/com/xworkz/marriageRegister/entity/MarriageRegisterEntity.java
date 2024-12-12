package com.xworkz.marriageRegister.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="marriage_table")
@Data
@NoArgsConstructor
public class MarriageRegisterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "bride_name")
    private String brideName;

    @Column(name="groom_name")
    private String groomName;
}
