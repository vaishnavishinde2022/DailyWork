package com.practice.model;

import com.practice.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.practice.entity.User;

@Component
public class ModelClass 
{
  @Autowired
   UserRepo user;
  
  public String insertData(User userObj)
  {
	  User result= user.save(userObj);
	  
	  System.out.println(result);
	  
	  return "Data inserted successfully";
  }
  
}
