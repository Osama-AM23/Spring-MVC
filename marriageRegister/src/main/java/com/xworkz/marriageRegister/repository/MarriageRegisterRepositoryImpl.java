package com.xworkz.marriageRegister.repository;

import com.xworkz.marriageRegister.entity.MarriageRegisterEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class MarriageRegisterRepositoryImpl implements MarriageRegisterRepository{

    public MarriageRegisterRepositoryImpl(){
        System.out.println("No-Args Const Of MarriageRegisterRepositoryImpl");
    }
    @Override
    public boolean send(MarriageRegisterEntity entity) {

        System.out.println("Executing send in MarriageRegisterRepositoryImpl");

        EntityManagerFactory emFactory =Persistence.createEntityManagerFactory("newLife");
        EntityManager eManager =emFactory.createEntityManager();
        EntityTransaction eTrans =eManager.getTransaction();

        try {
            eTrans.begin();
            eManager.persist(entity);
            eTrans.commit();
        }catch (Exception e){
            if (eTrans.isActive()){
                eTrans.rollback();
            }
            e.printStackTrace();
        }finally {
            emFactory.close();
            eManager.close();
        }

        return true;
    }
}
