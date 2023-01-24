package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
* this annotation is use to mark the main class of spring boot application.And it encapsulates
* @SpringBootConfiguration ,@EnableAutoConfiguration and @ComponentScan annotations
*/
@SpringBootApplication
public class Bootjpaexample2Application 
{

	public static void main(String[] args)
	{
		/*
		 * SpringApplication class is use to bootstrap and launch a spring application from the java main method.
		 * This class automatically creates the ApplicationContext from classpath,scan the configuration classes and launch the application.
		 */
		
		/*
		 * ApplicationContext is an interface present in org.springframework.context package.It represents
		 * the spring IoC container and responsible for instantiating,configuring,and assembling the beans.
		 */
		ApplicationContext context=SpringApplication.run(Bootjpaexample2Application.class, args);
		
		//Here we instantiating EmployeeRepository by using context.
		/*
		 * EmployeeRepository extend CrudRepository ,so it can provides methods for CRUD operations like save(),saveAll(),
		 * findById(Id),findAll(),deleteById(Id),deleteAll() and many more.
		 */
		EmployeeRepository emprepo=context.getBean(EmployeeRepository.class);
		
		//save one object
	/**	Employee emp1=new Employee();
		
		emp1.setName("Ms.sakshi");
	 
	  emp1.setEmail("sakshi123@gmail.com");
	  emp1.setDesignation("java developer");
	  emp1.setDepartment("java");
	  emp1.setAddress("sangamner");
	  
	  Employee employee=emprepo.save(emp1);
	  
	  System.out.println(employee);**/
	//*************************************************************************************
		
		//save multiple objects
		/**Employee emp2=new Employee();
		
		  emp2.setName("Mr.Akash");
		  emp2.setEmail("akash945@gmail.com");
		  emp2.setDesignation("php developer");
		  emp2.setDepartment("php");
		  emp2.setAddress("pune");
		  
		  Employee emp3=new Employee();
			
		  emp3.setName("Mr.Sairaj");
		  emp3.setEmail("sairaj939@gmail.com");
		  emp3.setDesignation(".Net developer");
		  emp3.setDepartment(".Net");
		  emp3.setAddress("Mumbai");
		  
		  ArrayList<Employee> arrayList=new ArrayList();
		  
		  arrayList.add(emp2);
		  arrayList.add(emp3);
		  
		  Iterable itr=emprepo.saveAll(arrayList);
		  
		  itr.forEach(e->System.out.println(e));**/
		//********************************************************************
		
		//code for update
		
		/**Optional<Employee> optional=emprepo.findById(52);
		
		Employee emp4=optional.get();
		System.out.println(emp4);
		
		emp4.setAddress("sangamner");
		
		Employee result=emprepo.save(emp4);
		System.out.println("After update:");
		System.out.println(result);**/
		//*****************************************************************************
		
		//Get all data from table
		
		Iterable<Employee>itr2=emprepo.findAll();
		
		itr2.forEach(e2->System.out.println(e2));
		
		//*********************************************************************************
		
		//deleting the Employee object
		
		/**emprepo.deleteById(52);
		System.out.println("deleted");**/
		
		  //we can delete all object at a time by using deleteAll() method.
		   
		  /** Iterable<Employee> itr1=emprepo.findAll();
		   
		   itr1.forEach(e3->{System.out.println(e3);});
		   
		   emprepo.deleteAll(itr1);**/
		
		//**************************************************************************
		
		//Custom Derived query methods
		   List<Employee> users=emprepo.findByName("Mr.Sairaj");
		   
		   users.forEach(e->System.out.println(e));
		   
		   List<Employee> user2=emprepo.findByNameAndAddress("Mr.Sairaj", "Mumbai");
		   
		   user2.forEach(e->System.out.println(e));
		   
		   List<Employee> user3=emprepo.findByNameStartingWith("M");
		   user3.forEach(e->System.out.println(e));
		   
		   List<Employee> user4=emprepo.findByNameEndingWith("j");
		   user4.forEach(e->System.out.println(e));
		   System.out.println("*********************************************************");
		   List<Employee> user5=emprepo.findByNameOrderByName("Mr.Sairaj");
		   user5.forEach(e->System.out.println(e));
		
		  
	}

}
