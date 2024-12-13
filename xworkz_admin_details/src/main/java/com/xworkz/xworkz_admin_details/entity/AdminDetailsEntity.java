package com.xworkz.xworkz_admin_details.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "login_details_table")
@Data
@NoArgsConstructor

public class AdminDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    private String email;

    private String password;

    @Column(name = "confirm_password")
    private String confirmPassword;

    private String phone;

    public AdminDetailsEntity(String name, int age, String email, String password, String confirmPassword, String phone) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.phone = phone;
    }
}
