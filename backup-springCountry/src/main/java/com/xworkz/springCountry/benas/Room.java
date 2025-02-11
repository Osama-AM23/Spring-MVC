package com.xworkz.springCountry.benas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Room {
    @Value("600 sq ft.")
    private String roomSize;
    @Value("5")
    private String noOfRooms;
}
