package com.xworkz.springForms.service;

import org.springframework.stereotype.Service;

@Service
public class HotelRoomServiceImpl implements HotelRoomService{

    public HotelRoomServiceImpl(){
        System.out.println("No-Args Const of HotelRoomServiceImpl");
    }

    @Override
    public boolean checkAndBook() {
        System.out.println("Executing a checkAndBook in HotelRoomServiceImpl");
        return true;
    }
}
