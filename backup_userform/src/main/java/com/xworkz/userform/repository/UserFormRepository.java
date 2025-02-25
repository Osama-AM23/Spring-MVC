package com.xworkz.userform.repository;

import com.xworkz.userform.dto.UserFormDto;
import com.xworkz.userform.entity.UserFormEntity;

import java.util.List;

public interface UserFormRepository {

    boolean save(UserFormEntity userFormEntity);

    List<UserFormEntity> getAll() ;

    void deleteUserById(int id);

    UserFormEntity findById(Integer id);

    boolean updateUser(UserFormEntity userFormEntity);

}
