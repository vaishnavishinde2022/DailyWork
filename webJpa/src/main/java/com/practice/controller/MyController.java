package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.practice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.practice.model.ModelClass;
@Controller
public class MyController 
{
	static String msg="";
	boolean flag=false;
	
	@Autowired
	User userObj;
	
	@Autowired
	ModelClass modelObj; 
	
  @GetMapping("/Registration")
  public String registrationMethod()
  {
	  System.out.println("Inside registration...");
	  
	return "registrationForm"; 
	  
  }
  
  @PostMapping("/details")
  public String operation(@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("mobile")String mobile,@RequestParam("username")String username,@RequestParam("password")String password,Model model)
  {
	  userObj=new User(name,email,mobile,username,password);
	  
	  int len=mobile.length();
	  for(int i=0;i<email.length();i++)
	  {
		if(email.charAt(i)=='@')
		{
			flag=true;	
		}
	  }
	  
	   
	  if(len==10 && flag)
	  {
		  msg=modelObj.insertData(userObj); 
		  System.out.println(msg);
			model.addAttribute("name",name);
			model.addAttribute("email",email);
			model.addAttribute("mobile",mobile);
			model.addAttribute("username",username);
			model.addAttribute("password",password);
			return "storedmsg";	
	  }
	  else
	  {
		 
		  return "error";  
	  }
	
	  
  }
  
  @PostMapping("/loginPage")
  public String showLogin()
  {
	  return "login";
  }
  
}
