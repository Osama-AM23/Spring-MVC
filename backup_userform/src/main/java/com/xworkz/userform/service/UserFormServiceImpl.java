package com.xworkz.userform.service;

import com.xworkz.userform.dto.UserFormDto;
import com.xworkz.userform.entity.UserFormEntity;
import com.xworkz.userform.repository.UserFormRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserFormServiceImpl implements UserFormService {
    @Autowired
    UserFormRepository formRepository;

    public UserFormServiceImpl() {
        System.out.println("No-Args Const of UserFormServiceImpl");
    }


    UserFormDto dto = new UserFormDto();

    @Override
    public boolean validateAndSave(UserFormDto userFormDto) {

        UserFormEntity userFormEntity = new UserFormEntity();

        userFormEntity.setFirstName(userFormDto.getFirstName());
        userFormEntity.setLastName(userFormDto.getLastName());
        userFormEntity.setEmail(userFormDto.getEmail());
        userFormEntity.setContactNo(userFormDto.getContactNo());

        formRepository.save(userFormEntity);
        return true;
    }

    @Override
    public List<UserFormDto> getAll() {
        List<UserFormDto> userFormDtos = new ArrayList<>();
        List<UserFormEntity> userEntities = formRepository.getAll();
        for (UserFormEntity entity : userEntities) {
            UserFormDto dto = new UserFormDto();
            BeanUtils.copyProperties(entity, dto);
            userFormDtos.add(dto);
        }


        return userFormDtos;
    }

    @Override
    public void deleteUserById(int id) {
        formRepository.deleteUserById(id);
    }

    @Override
    public UserFormDto findById(Integer id) {
        UserFormDto userFormDto = new UserFormDto();
        UserFormEntity formEntity = formRepository.findById(id);

        BeanUtils.copyProperties(formEntity,userFormDto );
        System.out.println("SERVICE :"+formEntity);
        return userFormDto;
    }

    @Override
    public boolean updateUser(UserFormDto userFormDto) {
        UserFormEntity userFormEntity = new UserFormEntity();
        BeanUtils.copyProperties(userFormDto, userFormEntity);

        formRepository.updateUser(userFormEntity);
        return true;
    }
}
