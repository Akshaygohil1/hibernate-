package com.angel;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client 
{
	public static void main(String[] args) 
	{
		
		//Creating SessionFactory
		SessionFactory factory = 
				new Configuration().configure().buildSessionFactory();
		//Creating Session
		Session session = factory.openSession();
		//Starting the transaction
		Transaction tx = session.beginTransaction();
		 
		//retrieving based on the Employee id 
		Employee e1 = session.load(Employee.class, 2);
		
		
		//Employee obj1 = new Employee("name",100000);
		//session.save(obj1);
		
		
		
		//update name
		//e1.setName("akshay");
		//e1.setSalary(40000);
		
		//deleting the record
		//session.delete(e1);
		
		
		tx.commit();
		
		System.out.println("record is deleted sucessfully");
		System.out.println(e1);
	}

}
