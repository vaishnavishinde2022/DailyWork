package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * this annotation is use to mark the main class of spring boot application.And it encapsulates
 * @SpringBootConfiguration ,@EnableAutoConfiguration and @ComponentScan annotations
 */
@SpringBootApplication
public class PassClientDataByUsingModelAndViewApplication {

	public static void main(String[] args) 
	{
		/*
		 * SpringApplication class is use to bootstrap and launch a spring application from the java main method.
		 * This class automatically creates the ApplicationContext from classpath,scan the configuration classes and launch the application.
		 */
		SpringApplication.run(PassClientDataByUsingModelAndViewApplication.class, args);
	}

}
