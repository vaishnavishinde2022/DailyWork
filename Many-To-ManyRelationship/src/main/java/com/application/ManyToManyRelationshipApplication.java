package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ManyToManyRelationshipApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(ManyToManyRelationshipApplication.class, args);
	}

}
