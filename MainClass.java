package com.Mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Country;
import com.entity.Employee;


public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("springbeans.xml");
		
		Employee e= context.getBean("emp",Employee.class);
		Country c= context.getBean("c",Country.class);
		
		System.out.println(e);	
	}

}