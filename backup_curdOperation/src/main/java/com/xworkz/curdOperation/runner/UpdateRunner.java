package com.xworkz.curdOperation.runner;

import javax.persistence.*;

public class UpdateRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("payingGuest");
        EntityManager eMnag = emf.createEntityManager();
        EntityTransaction eTrans = eMnag.getTransaction();

        try {

            eTrans.begin();
            Query query = eMnag.createNamedQuery("updateByid");
            query.setParameter("byId", 9);
            query.setParameter("byGuestName", "Samiullah");
            query.executeUpdate();
            eTrans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            eMnag.close();
        }
    }
}
