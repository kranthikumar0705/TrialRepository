package com.kranthi.app.util;

import java.util.Properties;

public class ConnectionPropertiesUtil {
	public static  Properties getMyDbConnectionProperties()
	{
		Properties p=new Properties();
		p.setProperty("connection.driver_class","com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/config_db");
		p.setProperty("hibernate.connection.username", "root");
		p.setProperty("hibernate.connection.password", "Dreamer");
		p.setProperty("hibernate.show_sql","true");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		return p;
		
		
	}

}
