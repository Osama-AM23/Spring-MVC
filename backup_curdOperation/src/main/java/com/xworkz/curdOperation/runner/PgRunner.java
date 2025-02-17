package com.xworkz.curdOperation.runner;

import com.xworkz.curdOperation.entity.PgEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PgRunner {

    public static void main(String[] args) {

        EntityManagerFactory emFac = Persistence.createEntityManagerFactory("payingGuest");
        EntityManager em = emFac.createEntityManager();
        EntityTransaction eTrans = em.getTransaction();

        List<PgEntity> list = new ArrayList<PgEntity>();

        list.add(new PgEntity("Aswin", 9433012993L, "RajajiNagar", "3-Sharing", 5800.0));
        list.add(new PgEntity("Osama", 7790822451L, "RajajiNagar", "3-Sharing", 5500.0));
        list.add(new PgEntity("Azees", 7655401014L, "VijayaNagar", "1-Sharing", 7000.0));
        list.add(new PgEntity("Mosina", 9710232993L, "Okalipuram", "2-Sharing", 6000.0));
        list.add(new PgEntity("Mujahid", 7675011226L, "Okalipuram", "2-Sharing", 6000.0));
        list.add(new PgEntity("Assadiq", 9655487446L, "HSR Layout", "3-Sharing", 5800.0));
        list.add(new PgEntity("Thameem", 9433678712L, "BTM Layout", "3-Sharing", 5800.0));
        list.add(new PgEntity("Hunain", 6500100293L, "Madiwala", "4-Sharing", 6000.0));
        list.add(new PgEntity("Samiu", 8433010233L, "BTM Layout", "4-Sharing", 6000.0));
        list.add(new PgEntity("Arun", 9433012127L, "RajajiNagar", "4-Sharing", 6200.0));

        for (PgEntity entity : list) {
            em.persist(entity);
        }

        try {
            eTrans.begin();
            eTrans.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }


    }


}
