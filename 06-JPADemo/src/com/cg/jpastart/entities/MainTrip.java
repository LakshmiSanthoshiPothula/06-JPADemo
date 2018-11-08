package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainTrip {
public static void main(String[] args) {
	SeatInfo info= new SeatInfo(30,80,78);
	Trip trip=new Trip();
	trip.setFromCity("chennai");
	trip.setToCity("kakinada");
	trip.setInfo(info);
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	em.getTransaction().begin();
	em.persist(trip);
	em.getTransaction().commit();
	em.close();
	factory.close();
	
	
}
}
