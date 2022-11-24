package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeDao;

@SpringBootApplication
public class Demo9Application {

	public static void main(String[] args) {
	    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
	    EmployeeDao dao=(EmployeeDao)context.getBean("d");  
	      
	    Employee e=new Employee();  
	    e.setId(2);  
	    e.setName("varun");  
	    e.setSalary(50000);  
	      
	    dao.saveEmployee(e);  
	}
}
