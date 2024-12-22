package com.xworkz.xworkz_commonModule_osama.service;

import com.xworkz.xworkz_commonModule_osama.dto.SignupDTO;

public interface SignupService {

    public boolean validateAndSave(SignupDTO signupDTO);


    public long getCountByName(String userName);

    public long getCountByEmail(String email);

    public long getCountByPhone(String phone);

    public long getCountByAlterEmail(String alterEmail);

    public long getCountByAlterPhone(String alterPhone);


    public String onSignin(String email, String password);

    public boolean onUpdate(String email, String newPassword, String confirmPassword);
}
