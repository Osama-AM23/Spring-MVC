package com.xworkz.curdOperation.runner;

import javax.persistence.*;
import java.util.List;

public class GetDataRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("payingGuest");
        EntityManager eMang = emf.createEntityManager();
        EntityTransaction eTrans = eMang.getTransaction();

        Query query = null;
        try {
            eTrans.begin();
            query = eMang.createNamedQuery("getData");
            query.setParameter("rent", 6000.0);

            List<String> list = query.getResultList();
            for (String guestName : list) {
                System.out.println("VALUES :" + guestName);

            }
            eTrans.commit();
            // String guestName = (String) query.getSingleResult();

            // System.out.println("VALUES :" + guestName);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            eMang.close();
        }


    }
}