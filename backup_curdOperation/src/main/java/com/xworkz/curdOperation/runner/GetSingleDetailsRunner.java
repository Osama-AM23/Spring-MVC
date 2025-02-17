package com.xworkz.curdOperation.runner;

import com.xworkz.curdOperation.entity.PgEntity;

import javax.persistence.*;
import java.util.List;

public class GetSingleDetailsRunner {

    public static void main(String[] args) {
        // to getting the single row data
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("payingGuest");
        EntityManager eManag =emf.createEntityManager();
        EntityTransaction eTrans =eManag.getTransaction();

        Query query =eManag.createNamedQuery("getSingleDetail");
        query.setParameter("byId", 1);

        List<PgEntity> list =query.getResultList();
        list.forEach(get-> System.out.println(get));

        try{
            eTrans.begin();
            eTrans.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            eManag.close();
        }
    }
}
