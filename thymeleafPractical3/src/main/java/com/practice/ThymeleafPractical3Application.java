package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication this annotation is used to mark the main class of a spring boot application
@SpringBootApplication

public class ThymeleafPractical3Application 
{

	public static void main(String[] args) 
	{
		//SpringApplication.run is used to bootstrap and launch a Spring application from a java main method.
		SpringApplication.run(ThymeleafPractical3Application.class, args);
	}

}
