/*
 * In bellow code you will get how to perform CRUD operation using JPA and Spring boot.
 * C-Create
 * R-Read
 * U-Update
 * D-Delete
 */

package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

@SpringBootApplication
public class BootJpaExampleApplication
{

	public static void main(String[] args)
	{
		ApplicationContext context=SpringApplication.run(BootJpaExampleApplication.class, args);
		
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		//User user=new User();
		
		//user.setUserName("vaishnavi");
		//user.setCity("sangamner");
		
		//User user1=userRepository.save(user);
		
		//System.out.println(user1);
		
		//create object of User
		
		/**User user1=new User();
		
		user1.setUserName("Rutuja");
		user1.setCity("pune");
		
		User user2=new User();
		user2.setUserName("Akash");
		user2.setCity("nashik");**/
		
		//saving single user
		//User resultUser=userRepository.save(user2);
		
		//System.out.println("saved user:"+resultUser);
		//System.out.println("done");
	//*******************************************************************************************
		
		//save multiple objects
		
		/**ArrayList<User> arrayList=new ArrayList();
		arrayList.add(user1);
		arrayList.add(user2);
		
		//to save multiple object we can use saveAll() method of UserRepository.
		 //Iterable is an interface which is present in java.lang package.
		  
		  Iterable<User> result=userRepository.saveAll(arrayList);
		
		result.forEach(user->{
		  System.out.println(user);
			
		});
		
		System.out.println("done");**/
	//*********************************************************************************************	
		//code for update
		
		//Optional is a class/container object used to contain not-null objects.
		/**Optional<User> optional=userRepository.findById(1);
		
		User user=optional.get();
		
		user.setUserName("Mr.Tushar");
		User result=userRepository.save(user);
		System.out.println(result);
		
		System.out.println("Updated");**/
		
	//*************************************************************************************	
		//how to get data
		//findById(id)->return Optional Containing your data
		
	     Iterable<User> itr=userRepository.findAll();
	     
	   itr.forEach(user3->{System.out.println(user3);});
	   
	   //*****************************************************************************************
	   
	   //Deleting the user element
	   
	  /** userRepository.deleteById(53);
	   System.out.println("Deleted");**/
	   
	   //we can delete all object at a time by using deleteAll() method.
	   
	  /** Iterable<User> itr1=userRepository.findAll();
	   
	   itr1.forEach(user4->{System.out.println(user4);});
	   
	   userRepository.deleteAll(itr1);**/
	//************************************************************************************   
	   
	   //Custom Derived query methods
	   List<User> users=userRepository.findByUserName("Rutuja");
	   
	   users.forEach(e->System.out.println(e));
	   
	   List<User> user2=userRepository.findByUserNameAndCity("Mr.Tushar", "sangamner");
	   
	   user2.forEach(e->System.out.println(e));
	   
	   List<User> user3=userRepository.findByUserNameStartingWith("M");
	   user3.forEach(e->System.out.println(e));
	   
	   List<User> user4=userRepository.findByUserNameEndingWith("a");
	   user4.forEach(e->System.out.println(e));
	   System.out.println("*********************************************************");
	   List<User> user5=userRepository.findByUserNameOrderByUserName("Rutuja");
	   user5.forEach(e->System.out.println(e));
	   
	}

}
