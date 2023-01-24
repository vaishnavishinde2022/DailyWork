package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.first.SubmissionFormApplication;
@ComponentScan
@SpringBootApplication

public class SubmissionFormApplication extends SpringBootServletInitializer
{
	
   protected Class<SubmissionFormApplication> configure(SubmissionFormApplication application)
   {
	   return (SubmissionFormApplication.class);
   }
	public static void main(String[] args)
	{
		SpringApplication.run(SubmissionFormApplication.class, args);
	}

}
