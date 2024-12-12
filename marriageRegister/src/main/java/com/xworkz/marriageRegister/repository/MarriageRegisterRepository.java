package com.xworkz.marriageRegister.repository;

import com.xworkz.marriageRegister.entity.MarriageRegisterEntity;

public interface MarriageRegisterRepository {

    public boolean send(MarriageRegisterEntity entity);
}
