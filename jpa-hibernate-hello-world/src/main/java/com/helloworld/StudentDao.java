package com.helloworld;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.RollbackException;

import ManyToOne.Student;



public class StudentDao 
{
	 private final EntityManagerFactory entityManagerFactory;

	    public StudentDao(EntityManagerFactory entityManagerFactory) {
	        this.entityManagerFactory = entityManagerFactory;
	    }

	    public List<Student> findAll() {
	       
	        EntityManager manager = this.entityManagerFactory.createEntityManager();
	        EntityTransaction transaction = null;
	        List<Student> students;
	        try {
	           
	            transaction = manager.getTransaction();
	          
	            transaction.begin();

	            
	            students = manager.createQuery("SELECT s FROM Student s", Student.class)
	                    .getResultList();

	         
	            transaction.commit();
	        } catch (RollbackException ex) {
	        
	            if (transaction != null) {
	                transaction.rollback();
	            }
	          
	            throw new RuntimeException(ex);
	        } finally {
	    
	            manager.close();
	        }
	        return students;
	    }

	    public void create(Student student) {
	       
	        EntityManager manager = this.entityManagerFactory.createEntityManager();
	        EntityTransaction transaction = null;

	        try {
	            
	            transaction = manager.getTransaction();
	           
	            transaction.begin();
	          
	            manager.persist(student);
	       
	            transaction.commit();
	        } catch (RollbackException ex) {
	           
	            if (transaction != null) {
	                transaction.rollback();
	            }
	           
	            throw new RuntimeException(ex);
	        } finally {
	   
	            manager.close();
	        }
	    }

	  
}
