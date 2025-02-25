package com.xworkz.trainBooking.service;

import com.xworkz.trainBooking.dto.TrainBookingDto;
import com.xworkz.trainBooking.entity.TrainBookingEntity;
import com.xworkz.trainBooking.repository.TrainBookingRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TrainBookingServiceImpl implements TrainBookingService {

    @Autowired
    TrainBookingRepository trainRepo;

    @Override
    public boolean validateAndSave(TrainBookingDto trainBookingDto) {
        TrainBookingEntity trainEntity = new TrainBookingEntity();
        BeanUtils.copyProperties(trainBookingDto, trainEntity);
        trainRepo.save(trainEntity);
        return false;
    }

    @Override
    public List<TrainBookingDto> getAll() {
        List<TrainBookingDto> trainDtos = new ArrayList<>();
        List<TrainBookingEntity> entityList= trainRepo.getAll();
        for(TrainBookingEntity entity : entityList){
            TrainBookingDto dto = new TrainBookingDto();
            BeanUtils.copyProperties(entity, dto);
            trainDtos.add(dto);
        }

        return trainDtos;
    }

    @Override
    public void removeData(int id) {

        trainRepo.removeData(id);
    }

    @Override
    public TrainBookingEntity findAll(int id) {
        System.out.println("SERVICE :"+trainRepo.findAll(id));
        return trainRepo.findAll(id);
    }

    @Override
    public boolean updateData(TrainBookingDto trainBookingDto) {

        TrainBookingEntity trainBookingEntity = new TrainBookingEntity();
        BeanUtils.copyProperties(trainBookingDto, trainBookingEntity);

        trainRepo.updateData(trainBookingEntity);
        return true;
    }
}
