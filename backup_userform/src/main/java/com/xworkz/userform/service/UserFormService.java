package com.xworkz.userform.service;

import com.xworkz.userform.dto.UserFormDto;
import com.xworkz.userform.entity.UserFormEntity;

import java.util.List;

public interface UserFormService {

    boolean validateAndSave(UserFormDto userFormDto);

    List<UserFormDto> getAll();

    void deleteUserById(int id);

    UserFormDto findById(Integer id);

    boolean updateUser(UserFormDto userFormDto);
}
