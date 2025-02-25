package com.xworkz.trainBooking.service;

import com.xworkz.trainBooking.dto.TrainBookingDto;
import com.xworkz.trainBooking.entity.TrainBookingEntity;

import java.util.List;

public interface TrainBookingService {

    boolean validateAndSave(TrainBookingDto trainBookingDto);

    List<TrainBookingDto> getAll();

    void removeData(int id);

    TrainBookingEntity findAll(int id);

    boolean updateData(TrainBookingDto trainBookingDto);
}
