package com.xworkz.trainBooking.repository;

import com.xworkz.trainBooking.entity.TrainBookingEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class TrainBookingRepositoryImpl implements TrainBookingRepository {

    private EntityManagerFactory emFac = Persistence.createEntityManagerFactory("trainForm");

    @Override
    public boolean save(TrainBookingEntity trainBookingEntity) {
        EntityManager eMang = emFac.createEntityManager();
        eMang.getTransaction().begin();
        eMang.persist(trainBookingEntity);
        eMang.getTransaction().commit();
        eMang.close();

        return true;
    }

    @Override
    public List<TrainBookingEntity> getAll() {
        EntityManager eManag = emFac.createEntityManager();
        return emFac.createEntityManager().createNamedQuery("getAll").getResultList();
    }

    @Override
    public void removeData(int id) {

        EntityManager eManag = emFac.createEntityManager();
        eManag.getTransaction().begin();
        eManag.createNamedQuery("deleteData").setParameter("id", id).executeUpdate();
        eManag.getTransaction().commit();
    }

    @Override
    public TrainBookingEntity findAll(Integer id) {
        EntityManager eManag = emFac.createEntityManager();
        Query query =eManag.createNamedQuery("findById").setParameter("id", id);
        System.out.println("REPO :"+query.getSingleResult());
        return(TrainBookingEntity) query.getSingleResult();
    }

    @Override
    public boolean updateData(TrainBookingEntity trainBookingEntity) {
        EntityManager eManag = emFac.createEntityManager();
        eManag.getTransaction().begin();
        TrainBookingEntity trainBookingEntitys = eManag.find(TrainBookingEntity.class, trainBookingEntity.getId());
        if (trainBookingEntitys != null) {
            eManag.merge(trainBookingEntity);
            eManag.getTransaction().commit();
        }
        return true;
    }
}
