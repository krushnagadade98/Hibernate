package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Student.class);
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		//Read Data		
//	System.out.println("get method");
//	Student student1=session.get(Student.class, 11);
//	System.out.println(student1);
//
//		System.out.println("load method");	
//		Student student=session.load(Student.class, 11);
//	System.out.println(student);
		
	
	  //create data
//		
//		Student student11=new Student(17,"varun",23);
//		
//		session.save(student11);
		//another way
//		Transaction transaction=session.beginTransaction();
//		transaction.commit();
//		session.beginTransaction().commit(); 
	  //update
//		Student student=session.get(Student.class, 10);
//		student.setName("NANDA");
//		student.setAge(45);
//		session.update(student);
//		session.beginTransaction().commit();

		        //delete
		
		Student student=session.get(Student.class, 15);
		session.delete(student);
		session.beginTransaction().commit();

	}

}
