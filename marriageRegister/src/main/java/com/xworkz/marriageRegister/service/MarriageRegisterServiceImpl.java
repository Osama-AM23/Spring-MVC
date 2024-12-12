package com.xworkz.marriageRegister.service;

import com.xworkz.marriageRegister.dto.MarriageRegisterDTO;
import com.xworkz.marriageRegister.entity.MarriageRegisterEntity;
import com.xworkz.marriageRegister.repository.MarriageRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarriageRegisterServiceImpl implements MarriageRegisterService {

    @Autowired
    private MarriageRegisterRepository repository;

    public MarriageRegisterServiceImpl() {
        System.out.println("No-Args Const Of MarriageRegisterServiceImpl");
    }

    @Override
    public boolean onSave(MarriageRegisterDTO dto) {

        System.out.println("Executing onSave in MarriageRegisterServiceImpl");
        MarriageRegisterEntity entity= new MarriageRegisterEntity();
        entity.setBrideName(dto.getBrideName());
        entity.setGroomName(dto.getGroomName());

        repository.send(entity);

        return true;
    }
}
