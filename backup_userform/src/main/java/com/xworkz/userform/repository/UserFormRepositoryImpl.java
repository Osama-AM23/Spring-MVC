package com.xworkz.userform.repository;

import com.xworkz.userform.dto.UserFormDto;
import com.xworkz.userform.entity.UserFormEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public class UserFormRepositoryImpl implements UserFormRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("userForm");

    public UserFormRepositoryImpl() {
        System.out.println("No-Args Const of UserFormReositoryImpl");
    }

    @Override
    public boolean save(UserFormEntity userFormEntity) {

        EntityManager eManag = emf.createEntityManager();
        eManag.getTransaction().begin();
        eManag.persist(userFormEntity);
        eManag.getTransaction().commit();
        eManag.close();
        return true;
    }

    @Override
    public List<UserFormEntity> getAll() {
        EntityManager eManag = emf.createEntityManager();

        return emf.createEntityManager().createNamedQuery("findAll").getResultList();
    }

    @Override
    public void deleteUserById(int id) {
        EntityManager eMang = emf.createEntityManager();
        eMang.getTransaction().begin();
        eMang.createNamedQuery("deleteUser").setParameter("id", id).executeUpdate();
        eMang.getTransaction().commit();

    }

    @Override
    public UserFormEntity findById(Integer id) {
        EntityManager eManag = emf.createEntityManager();
        Query query = eManag.createNamedQuery("findById").setParameter("id", id);
        System.out.println("Repo :" + query.getSingleResult());
        return (UserFormEntity) query.getSingleResult();
    }

    @Override
    public boolean updateUser(UserFormEntity userFormEntity) {

        EntityManager eManag = emf.createEntityManager();
        eManag.getTransaction().begin();
        UserFormEntity userFormEntitys = eManag.find(UserFormEntity.class, userFormEntity.getId());
        if (userFormEntitys != null) {
            eManag.merge(userFormEntity);
            eManag.getTransaction().commit();
        }
        eManag.close();
        return true;
    }
}
