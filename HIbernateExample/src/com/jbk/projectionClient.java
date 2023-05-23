package com.jbk;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class projectionClient {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Student.class);
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		
		Criteria criteria =session.createCriteria(Student.class);
		
		Projection projection=Projections.property("id");
		
		
		
		
		

	}

}
