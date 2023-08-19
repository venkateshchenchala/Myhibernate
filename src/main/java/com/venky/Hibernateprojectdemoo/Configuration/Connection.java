package com.venky.Hibernateprojectdemoo.Configuration;

import java.util.Properties;

public class Connection 
{
	public static Properties getproperties()
	{
	Properties p=new Properties();
	p.setProperty("hibernate.driver_class", "com.mysql.cj.jdbc.Driver");
	p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/venky_database");;
	p.setProperty("hibernate.connection.user", "root");
	p.setProperty("hibernate.connection.password", "root");
	p.setProperty("hibernate.hbm2ddl.auto", "update");
	p.setProperty("hibernate.show_sql", "true");
	return p;
}
}
