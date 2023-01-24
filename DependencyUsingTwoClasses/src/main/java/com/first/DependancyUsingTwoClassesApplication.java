package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@SpringBootApplication
//This annotation is used to mark the main class of a spring boot

@RestController
public class DependancyUsingTwoClassesApplication 
{

	public static void main(String[] args)
	{
		//This line will return the object at the time of execution
		ConfigurableApplicationContext context=SpringApplication.run(DependancyUsingTwoClassesApplication.class, args);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter customer name:");
		String name=sc.next();
		
		System.out.println("Enter customer id:");
		int id=sc.nextInt();
		
		System.out.println("Enter course name:");
		String course=sc.next();
		
		//in this line we trying to tell the spring container to return object of Customers class  
		Customers custObj=context.getBean(Customers.class);
		//Technologies techObj=context.getBean(Technologies.class);
		
		custObj.setCustId(id);
		custObj.setCustName(name);
		custObj.setCourseName(course);
		//custObj.setTechObj(techObj);
		
		custObj.dispaly();
	}

}
