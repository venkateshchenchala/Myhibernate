package com.venky.Hibernateprojectdemoo.Configuration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.venky.Hibernateprojectdemoo.Dto.SupermarketDto;
import com.venky.Hibernateprojectdemoo.Entity.Supermarket;

public class SupermarketRepository 
{
		public static void saveObjects(Supermarket ss)
		{
			Configuration c=new Configuration();
			c.setProperties(Connection.getproperties());
			c.addAnnotatedClass(Supermarket.class);
			SessionFactory sf = c.buildSessionFactory();
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.merge(ss);
			transaction.commit();
		}
		public static Supermarket getObjects(int id)
		{
			Configuration c=new Configuration();
			c.setProperties(Connection.getproperties());
			c.addAnnotatedClass(Supermarket.class);
			SessionFactory sf = c.buildSessionFactory();
			Session session = sf.openSession();
			Supermarket d=(Supermarket)session.get(Supermarket.class, id);
			System.out.println(d);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
			return d;
			
		}
		public static void updateObject(SupermarketDto d)
		{
			Supermarket s=getObjects(d.getId());
			s.setId(d.getId());
			s.setName(d.getName());
			s.setPrice(d.getPrice());
			saveObjects(s);
		}
		public static void deleteObject(int id)
		{
			Supermarket objects = getObjects(id);
			Configuration c=new Configuration();
			c.addAnnotatedClass(Supermarket.class);
			c.setProperties(Connection.getproperties());
			SessionFactory sf = c.buildSessionFactory();
			Session session = sf.openSession();
			session.delete(objects);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
			
		}

	}


