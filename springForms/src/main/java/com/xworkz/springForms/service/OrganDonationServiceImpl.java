package com.xworkz.springForms.service;

import org.springframework.stereotype.Service;

@Service
public class OrganDonationServiceImpl implements OrganDonationService{

    public OrganDonationServiceImpl(){
        System.out.println("No-Args Const of OrganDonationServiceImpl");
    }

    @Override
    public boolean validateAndSave() {
        System.out.println("Executing a ValidateAndSave in OrganDonationServiceImpl");
        return true;
    }
}
