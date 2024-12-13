package com.xworkz.xworkz_admin_details.repository;

import com.xworkz.xworkz_admin_details.entity.AdminDetailsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

@Repository
public class AdminDetailsRepositoryImpl implements AdminDetailsRepository {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    public AdminDetailsRepositoryImpl() {
        System.out.println("No-Agrs Const of AdminDetailsRepositoryImpl");
    }

    @Override
    public boolean onSend(AdminDetailsEntity entity) {
        System.out.println("Executing onSend in RepositoryImpl");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {

            entityTransaction.begin();
            entityManager.persist(entity);
            entityTransaction.commit();

        } catch (Exception e) {
            if (entityTransaction.isActive())
                entityTransaction.rollback();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return true;
    }


}

