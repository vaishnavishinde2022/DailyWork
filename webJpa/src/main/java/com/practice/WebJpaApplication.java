package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan

public class WebJpaApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(WebJpaApplication.class, args);
	}

}
