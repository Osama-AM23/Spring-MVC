package com.xworkz.xworkz_commonModule_osama.service;

import com.xworkz.xworkz_commonModule_osama.dto.SignupDTO;
import com.xworkz.xworkz_commonModule_osama.entity.SignupEntity;
import com.xworkz.xworkz_commonModule_osama.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.security.SecureRandom;
import java.util.Random;

@Service
public class SignupServiceImpl implements SignupService {


    private BCryptPasswordEncoder encoderPassword = new BCryptPasswordEncoder();

    @Autowired
    private SignupRepository repository;

    SignupEntity entity = new SignupEntity();

    private final static String character = "ABCDEFGHIJKLMNOPQRSTQUVWXYZabcdefghijkmloppqrstuvxxyz09876554321@";

    public SignupServiceImpl() {
        System.out.println("no-Args Const of SignupServiceImpl");
    }


    public boolean validateAndSave(SignupDTO dto) {

        boolean isValid = false;

        if (dto != null) {
            if (dto.getUserName() != null) {
                entity.setUserName(dto.getUserName());
                isValid = true;
            }

            if (dto.getEmail() != null) {
                entity.setEmail(dto.getEmail());
                isValid = true;
            }

            if (dto.getPhone() != null) {
                entity.setPhone(dto.getPhone());
                isValid = true;
            }

            if (dto.getAlterEmail() != null) {
                entity.setAlterEmail(dto.getAlterEmail());
                isValid = true;
            }

            if (dto.getAlterPhone() != null) {
                entity.setAlterPhone((dto.getAlterPhone()));
                isValid = true;
            }

            if (dto.getLocation() != null) {
                entity.setLocation(dto.getLocation());
                isValid = true;
            }

            if (dto.getEmail() != null) {
                StringBuilder stringBuilder = new StringBuilder();
                SecureRandom secureRandom = new SecureRandom();
                for (int i = 0; i < 9; i++) {
                    int index = secureRandom.nextInt(character.length());
                    stringBuilder = stringBuilder.append(character.charAt(index));
                }
                System.out.println(stringBuilder.toString());
                entity.setPassword(stringBuilder.toString());
                isValid = true;
            }
            entity.setSigninCount(-1);
            if (isValid) {
                repository.send(entity);
            }
        }
        return isValid;
    }

    @Override
    public long getCountByName(String userName) {
        System.out.println("SERVICE :" + userName);
        return repository.getCountOfName(userName);
    }

    @Override
    public long getCountByEmail(String email) {
        System.out.println("SERVICE :" + email);
        return repository.getCountOfEmail(email);
    }

    @Override
    public long getCountByPhone(String phone) {
        System.out.println("SERVICE :" + phone);
        return repository.getCountOfPhone(phone);
    }

    @Override
    public long getCountByAlterEmail(String alterEmail) {
        System.out.println("SERVICE :" + alterEmail);
        return repository.getCountOfAlterEmail(alterEmail);
    }

    @Override
    public long getCountByAlterPhone(String alterPhone) {
        System.out.println("SERVICE :" + alterPhone);
        return repository.getCountOfAlterPhone(alterPhone);
    }

    @Override
    public String onSignin(String email, String password) {
        System.out.println("Executing onSignin in ServiceImpl");
        SignupEntity entity = repository.onSignin(email);
        if (entity != null) {
            if (encoderPassword.matches(password, entity.getPassword())) {
                return entity.getUserName();
            }
            return null;

        }
        return null;
    }

    @Override
    public boolean onUpdate(String email, String newPassword, String confirmPassword) {
        System.out.println("SERVICE :on update method : " + email);
        if (newPassword.equals(confirmPassword)) {
            SignupEntity value = repository.getData(email);
            if (value != null) {
                entity.setPassword(encoderPassword.encode(confirmPassword));
                entity.setSigninCount(0);
                return repository.onUpdate(entity);
            }
            return false;
        }

        return false;
    }
}
