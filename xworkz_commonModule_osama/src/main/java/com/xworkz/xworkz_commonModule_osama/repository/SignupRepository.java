package com.xworkz.xworkz_commonModule_osama.repository;

import com.xworkz.xworkz_commonModule_osama.entity.SignupEntity;

public interface SignupRepository {

    public boolean send(SignupEntity entity);


    public Long getCountOfName(String userName);

    public long getCountOfEmail(String email);

    public long getCountOfPhone(String phone);

    public long getCountOfAlterEmail(String alterEmail);

    public long getCountOfAlterPhone(String alterPhone);


    public SignupEntity onSignin(String email);

    public SignupEntity getData(String email);

    public boolean onUpdate(SignupEntity entity);


}
