package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.practice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.practice.model.ModelClass;
@Controller
public class MyController 
{
	@Autowired
	User userObj;
	
	@Autowired
	ModelClass model; 
	
  @GetMapping("/Registration")
  public String registrationMethod()
  {
	  System.out.println("Inside registration...");
	  
	return "registrationForm"; 
	  
  }
  
  @PostMapping("/details")
  public void operation(@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("username")String username,@RequestParam("password")String password)
  {
	  userObj=new User(name,email,username,password);
	  
	String msg=model.insertData(userObj);
	
	System.out.println(msg);
	  
  }
  
}
