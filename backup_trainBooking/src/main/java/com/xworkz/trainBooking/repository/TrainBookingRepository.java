package com.xworkz.trainBooking.repository;

import com.xworkz.trainBooking.dto.TrainBookingDto;
import com.xworkz.trainBooking.entity.TrainBookingEntity;

import java.util.List;

public interface TrainBookingRepository {

    boolean save(TrainBookingEntity trainBookingEntity);

    List<TrainBookingEntity> getAll();

    void removeData(int id);

    TrainBookingEntity findAll(Integer id);

    boolean updateData(TrainBookingEntity trainBookingEntity);
}
