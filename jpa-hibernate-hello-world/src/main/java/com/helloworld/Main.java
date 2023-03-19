package com.helloworld;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ManyToOne.Student;

public class Main 
{
	public static void main(String[]args)
	{
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JavaHelps");
       
        StudentDao dao = new StudentDao(entityManagerFactory);

     
        Student alice = new Student();
        alice.setId(1);
        alice.setName("Alice");
    

        Student bob = new Student();
        bob.setId(2);
        bob.setName("Bob");
       

        Student charlie = new Student();
        charlie.setId(3);
        charlie.setName("Charlie");
        

      
        dao.create(alice);
        dao.create(bob);
        dao.create(charlie);


       
        Student newBob = new Student();
        newBob.setId(2);    
        newBob.setName("Bob");
       
     

        
     

        
        List<Student> students = dao.findAll();
        if (students != null) {
            for (Student student : students) {
                System.out.println(student);
            }
        }

       

       
        entityManagerFactory.close();
    }
}
