package com.example;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependancyDemoApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context=SpringApplication.run(DependancyDemoApplication.class, args);
		
		Customer custobj=context.getBean(Customer.class);
		
		custobj.dispaly();
		custobj.setCustname("Mr.shinde");
		custobj.setCustid(101);
		custobj.setAddress("pune");
		
		String name=custobj.getCustname();
		int id=custobj.getCustid();
		String address=custobj.getAddress();
		
		System.out.println("customer name:"+name);
		System.out.println("customer id:"+id);
		System.out.println("customer address:"+address);
		
		
	}

}
