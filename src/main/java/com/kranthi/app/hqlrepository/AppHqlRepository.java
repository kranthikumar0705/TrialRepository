package com.kranthi.app.hqlrepository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.kranthi.app.entity.StudentEntity;
import com.kranthi.app.util.SessionFactoryUtil;


public class AppHqlRepository {
	public List<StudentEntity> findAll()
	{
		String hqlQuery="from StudentEntity";
		StringBuilder builder = new StringBuilder();
		builder.append("from StudentEntity");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		 Query query = session.createQuery(hqlQuery);
		return query.getResultList();
	}
	public void deleteByName(String name)
	{
		String hqlQuery="delete from StudentEntity where name=:n";
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hqlQuery);
		Transaction transaction = session.beginTransaction();
		query.setParameter("n",name );
		query.executeUpdate();
		transaction.commit();	
	}
	public List<StudentEntity> findByname(String name)
	{
		String hqlQuery="from StudentEntity where name=:n";
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hqlQuery);
		query.setParameter("n", name);
		return query.getResultList();
		
	}
	public void updateByName(String name,String name1)
	{
		String hqlQuery="update StudentEntity set name=:m where name=:n";
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(hqlQuery);
		query.setParameter("m", name1);
		query.setParameter("n", name);
		
		query.executeUpdate();
		transaction.commit();
	
	}

}
