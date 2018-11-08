package com.cg.jpastart.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainUpper {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	 List<Student> studentList=null;
	
	 
	 Query q=em.createQuery("from Student");
	 studentList=q.getResultList();
	 String Temp=null;
	  em.getTransaction().begin();
	  
      for (Student student : studentList) {
   
		Temp=student.getName().toUpperCase();
		
	 	student.setName(Temp);
		
		em.merge(student);
		
	}
      em.getTransaction().commit();
      em.close();
      factory.close();
      
	System.out.println("changed");
	
}
}
