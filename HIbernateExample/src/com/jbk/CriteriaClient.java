package com.jbk;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CriteriaClient {

	public static void main(String[] args) {
		

		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Student.class);
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		
		
		Criteria criteria=session.createCriteria(Student.class);
		criteria.setMaxResults(4);
		List<Student>  student= criteria.list();
		for (Student student2 : student) {
			System.out.println(student2);
			
		}
	
		
		
	}
	

}
