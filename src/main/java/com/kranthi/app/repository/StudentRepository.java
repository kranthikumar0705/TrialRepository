package com.kranthi.app.repository;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.kranthi.app.dto.Student;
import com.kranthi.app.entity.StudentEntity;
import com.kranthi.app.util.SessionFactoryUtil;



public class StudentRepository {
	public void save(StudentEntity studentEntity)
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	      Session session = sessionFactory.openSession();
	     Transaction transaction = session.beginTransaction();
	     session.save(studentEntity);
	     transaction.commit();  
	    
	}
	public StudentEntity findById(long l)
	{
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	      Session session = sessionFactory.openSession();
	    StudentEntity entity = session.get(StudentEntity.class, l);
	    return entity;
	}
	public void update(StudentEntity e,long l)
	{
		StudentEntity entity = findById(l);
		if(entity!=null)
		{
			entity.setName(e.getName());
			entity.setSurname(e.getSurname());
		}
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	      Session session = sessionFactory.openSession();
	      Transaction transaction = session.beginTransaction();
	      session.update(entity);
	      transaction.commit();     
	}
	public void delete(long l)
	{
		StudentEntity entity = findById(l);
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	      Session session = sessionFactory.openSession();
	     Transaction transaction = session.beginTransaction();
	     session.delete(entity);
	     transaction.commit();	
	}

}
