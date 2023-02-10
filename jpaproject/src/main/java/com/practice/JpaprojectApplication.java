package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import java.util.ArrayList;
import java.util.Optional;

import com.practice.entities.Customer;
import com.practice.repository.CustomerRepo;

@SpringBootApplication
@ComponentScan
public class JpaprojectApplication
{

	public static void main(String[] args) 
	{
		ApplicationContext context=SpringApplication.run(JpaprojectApplication.class, args);
   		
		ArrayList<Customer> list=new ArrayList<Customer>();
		
		CustomerRepo customer=context.getBean(CustomerRepo.class);
		
		//create object of Customer
		/*Customer cust=new Customer();
		
		cust.setName("Vaishnavi");
		cust.setEmail("vaishnavi@gmail.com");
		cust.setCity("Sangamner");
		cust.setUsername("Vaishnavi12");
		cust.setPassword("vaishnavi@2003");
		
		Customer result=customer.save(cust);
		
		System.out.println(result);
		
		Customer cust2=new Customer();
		cust2.setName("Rutuja");
		cust2.setEmail("rutuja@gmail.com");
		cust2.setCity("Sangamner");
		cust2.setUsername("rutuja67");
		cust2.setPassword("rutuja@2004");
		
		Customer result2=customer.save(cust2);
		System.out.println(result2);*/
//************************************************************************
		
		//store multiple record in a table at a time
	/*	Customer cust3=new Customer();
		cust3.setName("Akash");
		cust3.setEmail("akash@gmail.com");
		cust3.setCity("Pune");
		cust3.setUsername("akashshinde");
		cust3.setPassword("aksh@2023");
		
		Customer cust4=new Customer();
		cust4.setName("Sakshi");
		cust4.setEmail("sakshi@gmail.com");
		cust4.setCity("Pune");
		cust4.setUsername("sakshiNighute");
		cust4.setPassword("sakshi@2023");
		
		list.add(cust3);
		list.add(cust4);
		
		Iterable<Customer> result3=customer.saveAll(list);
		
		result3.forEach(newcustomer->{
			System.out.println(newcustomer);
		});*/
		
//******************************************************************************		
	
		//update the customer of id 3
		/*Optional<Customer> op=customer.findById(3);
		
		Customer result4=op.get();
		result4.setName("Arjun");
		
		customer.save(result4);*/
		
//**********************************************************************************		
		
	//How to get the data
		//findById(id)->return Optional Containing data
		
		//findAll()-> to get all data 
		
		Iterable<Customer> itr=customer.findAll();
		
		itr.forEach(eachCustomer->{
			System.out.println(eachCustomer);
		});
		
//**************************************************************************************
	//Deleting the customer data
		
		customer.deleteById(3);
	}

}
