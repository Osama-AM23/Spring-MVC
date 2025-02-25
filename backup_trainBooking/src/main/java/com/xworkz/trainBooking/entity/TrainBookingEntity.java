package com.xworkz.trainBooking.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "trainBook_table")

@NamedQuery(name = "getAll", query = "Select te from TrainBookingEntity te")
@NamedQuery(name = "deleteData", query = "Delete from TrainBookingEntity where id= :id")
@NamedQuery(name="findById", query = "Select te from TrainBookingEntity te where id = :id")
public class TrainBookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String source;

    private String destination;

    private int noOfMembers;
}
