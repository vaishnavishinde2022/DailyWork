package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class OrderAndAddressOneToOneMappingApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(OrderAndAddressOneToOneMappingApplication.class, args);
	}

}
