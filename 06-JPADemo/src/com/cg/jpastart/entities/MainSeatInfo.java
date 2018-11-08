package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainSeatInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Trip trip=null;

		trip =em.find(Trip.class,3);
		System.out.println(trip);
		System.out.println(trip.getInfo());
		em.close();
		factory.close();
		
	
	}

}
