package com.kranthi.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kranthi.app.entity.StudentEntity;

public class SessionFactoryUtil {
private static  SessionFactory sessionFactory;
private SessionFactoryUtil()
{
	
}
public static SessionFactory getSessionFactory()
{
	if(sessionFactory==null)
	{
		Configuration con=new Configuration();
		con.setProperties(ConnectionPropertiesUtil.getMyDbConnectionProperties());
		con.addAnnotatedClass(StudentEntity.class);
	      sessionFactory = con.buildSessionFactory();
		
	}
	return sessionFactory;
}

}
