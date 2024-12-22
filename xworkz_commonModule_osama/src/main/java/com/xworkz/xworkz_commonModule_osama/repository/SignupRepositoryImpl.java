package com.xworkz.xworkz_commonModule_osama.repository;

import com.xworkz.xworkz_commonModule_osama.entity.SignupEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Repository
public class SignupRepositoryImpl implements SignupRepository {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    public SignupRepositoryImpl() {
        System.out.println("No-Args Const of SignupRepositoryImpl");
    }

    @Override
    public Long getCountOfName(String userName) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        System.out.println("REPOSITORY :" + userName);
        Query query = manager.createNamedQuery("getCountOfName");
        query.setParameter("setUserName", userName);
        Long count = (Long) query.getSingleResult();

        try {
            transaction.begin();
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            manager.close();
        }

        return count;
    }

    @Override
    public long getCountOfEmail(String email) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        System.out.println("REPOSITORY: " + email);
        Query query = manager.createNamedQuery("getCountOfEmail");
        query.setParameter("setEmail", email);
        Long count = (Long) query.getSingleResult();


        return count;
    }

    @Override
    public long getCountOfPhone(String phone) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        System.out.println("REPOSITORY :" + phone);
        Query query = manager.createNamedQuery("getCountOfPhone");
        query.setParameter("setPhone", phone);
        Long count = (Long) query.getSingleResult();

        return count;
    }

    @Override
    public long getCountOfAlterEmail(String alterEmail) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        System.out.println("REPOSITORY :" + alterEmail);
        Query query = manager.createNamedQuery("getCountOfAlterEmail");
        query.setParameter("setAlterEmail", alterEmail);
        Long Count = (Long) query.getSingleResult();

        return Count;
    }

    @Override
    public long getCountOfAlterPhone(String alterPhone) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        System.out.println("REPOSITORY :" + alterPhone);
        Query query = manager.createNamedQuery("getCountOfAlterPhone");
        query.setParameter("setAlterPhone", alterPhone);
        Long count = (Long) query.getSingleResult();

        return count;
    }

    @Override
    public SignupEntity onSignin(String email) {
        System.out.println("Executing onSignin in RepositoryImpl");

        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        SignupEntity singleResult = null;
        try {
            Query query = manager.createNamedQuery("getName");
            query.setParameter("setEmail", email);
            singleResult = (SignupEntity) query.getSingleResult();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return singleResult;
    }

    @Override
    public SignupEntity getData(String email) {

        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        try {
            Query query = manager.createNamedQuery("getValue");
            query.setParameter("byEmail", email);
            System.out.println("Email from TRY BLOCK :" + email);
            Object singleData = query.getSingleResult();
            return (SignupEntity) singleData;

        } catch (Exception e) {
            if (transaction.isActive())
                transaction.rollback();
            return null;
        } finally {
            manager.close();
        }


    }

    @Override
    public boolean onUpdate(SignupEntity entity) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try {
            transaction.begin();
            manager.merge(entity);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            manager.close();
        }
    }

    @Override
    public boolean send(SignupEntity entity) {

        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        try {
            transaction.begin();
            manager.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            manager.close();
        }
        return true;
    }
}
