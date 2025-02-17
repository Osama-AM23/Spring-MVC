package com.xworkz.curdOperation.runner;

import javax.persistence.*;

public class DeleteDataRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("payingGuest");
        EntityManager eManager =emf.createEntityManager();
        EntityTransaction eTrans =eManager.getTransaction();

        try{
            eTrans.begin();
            Query query = eManager.createNamedQuery("deleteData");
            query.setParameter("byname", "Arun");

            query.executeUpdate();
            eTrans.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            eManager.close();
        }
    }
}
