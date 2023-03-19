package com.jpa.JPAPROJECT;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
    	Employee a = new Employee();
        a.setId(10);
        a.setName("He");
        a.setEmail("he@gmail.com");
        Employee b = new Employee();
        b.setId(9);
        b.setName("Boss");
        b.setEmail("Boss@gmail.com");
       
        

      	EntityManagerFactory emf = Persistence.createEntityManagerFactory("project");
      	EntityManager em = emf.createEntityManager();

      	em.getTransaction().begin();
      	em.persist(a);
      	em.getTransaction().commit();
      	System.out.println(a);
      	em.close();
      }
    
}
