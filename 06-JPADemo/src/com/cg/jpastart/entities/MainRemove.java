package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MainRemove {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	Student student = null;
	student=em.find(Student.class, 2);
	em.getTransaction().begin();
	em.remove(student); //delete
	em.getTransaction().commit();
	
	System.out.println("Removed one student to database.");
	em.close();
	factory.close();
}
}
