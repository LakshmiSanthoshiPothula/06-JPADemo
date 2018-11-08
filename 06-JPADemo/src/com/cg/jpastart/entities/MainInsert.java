package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		System.out.println("creating a bean ..");
		
		Student student = new Student();
		student.setName("bagi");
		//why id has not been set
		//ans : we have chosen it to be auto generated 
		em.persist(student); //insert 
		em.getTransaction().commit(); //pesist has to be given within a transaction
		
		System.out.println("Added one student to database.");
		em.close();
		factory.close();

	}

}
