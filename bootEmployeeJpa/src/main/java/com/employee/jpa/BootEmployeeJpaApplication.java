package com.employee.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * @SpringBootApplication is used to mark the main class of spring boot application.
 * it is encapsulates @SpringBootConfiguration,@EnableAutoConfiguration,@ComponentScan annotations.
 */
@SpringBootApplication
@ComponentScan
public class BootEmployeeJpaApplication 
{

	public static void main(String[] args)
	{
		/*
		 * SpringApplication is a class that present in org.springframework.boot package.
		 * it is used to bootstrap and launch the spring application from the java main method.
		 */
		SpringApplication.run(BootEmployeeJpaApplication.class, args);
	}

}
