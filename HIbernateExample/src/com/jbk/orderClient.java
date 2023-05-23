package com.jbk;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

public class orderClient {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Student.class);
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		
		Criteria criteria =session.createCriteria(Student.class);
		
		criteria.addOrder(Order.desc("id"));
		
		List<Student> student=criteria.list();
		for (Student student2 : student) {
			
			System.out.println(student2);
			
		}
	
	}

}
