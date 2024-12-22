package com.xworkz.xworkz_commonModule_osama.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "signup_module_table")
@NamedQuery(name = "getCountOfName", query = "Select Count(se) From SignupEntity se Where se.userName = :setUserName")
@NamedQuery(name="getCountOfEmail", query="Select count(se) From SignupEntity se Where se.email= :setEmail")
@NamedQuery(name="getCountOfPhone", query = "Select count(se) From SignupEntity se Where se.phone= :setPhone")
@NamedQuery(name="getCountOfAlterEmail", query = "Select count(se) From SignupEntity se Where se.alterEmail= :setAlterEmail")
@NamedQuery(name = "getCountOfAlterPhone", query = "Select count(se) From SignupEntity se Where se.alterPhone= :setAlterPhone")

@NamedQuery(name="getName", query = "Select se From SignupEntity se Where se.email= :setEmail")

@NamedQuery(name = "getValue", query = "Select se From SignupEntity se Where se.email= :byEmail")
public class SignupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;

    private String email;

    private String password;

    private String phone;

    private String alterEmail;

    private String alterPhone;

    private String location;

    private int signinCount;
}
