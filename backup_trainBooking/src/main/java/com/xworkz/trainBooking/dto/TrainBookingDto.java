package com.xworkz.trainBooking.dto;

import lombok.Data;

@Data
public class TrainBookingDto {

    private int id;

    private String source;

    private String destination;

    private int noOfMembers;
}
