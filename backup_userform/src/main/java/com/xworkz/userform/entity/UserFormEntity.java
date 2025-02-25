package com.xworkz.userform.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "userform_table")
@Data

@NamedQuery(name = "findAll", query = "SELECT ue FROM UserFormEntity ue")
@NamedQuery(name="deleteUser", query = "Delete From UserFormEntity where id = :id")
@NamedQuery(name = "findById", query = "select ue From UserFormEntity ue where ue.id = :id")
public class UserFormEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private Long contactNo;
}
