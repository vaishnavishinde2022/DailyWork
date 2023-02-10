package com.practice.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;

@Controller
public class MyController 
{
	@RequestMapping(value="/aboutRegistration",method=RequestMethod.GET)
   public String about()
   {
	   System.out.println("Inside about handlet...");
	   
	   	   
	   return "registration";
   }
	
	@PostMapping("/details")
	
	/*
	 * Model is an interface in spring framework. it defines a placeholder for model attributes and is primarily designed for adding attribute to the model
	 * It also use to transfer data between the view and controller of the spring MVC application.
	 * 
	 * @RequestParam annotation is used to extract input data that may be passed as a query,form data,or any arbitrary custom data.
	 */
	public String showDetails(@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("username")String username,@RequestParam("password")String password,Model model)
	{
		//putting data in model
		model.addAttribute("name",name);
		model.addAttribute("userEmail",email);
		model.addAttribute("username",username);
		model.addAttribute("userpassword",password);
		
		model.addAttribute("currentDate",new Date());
		
		return "about1";
	}
	
	@GetMapping("/example-loop")
	public String iterateHandler(Model model)
	{
		//create a ArrayList
		
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("Java");
		arraylist.add("Php");
		arraylist.add("Python");
		arraylist.add("C");
		arraylist.add("C++");
		arraylist.add("Rubby");
		
		model.addAttribute("list",arraylist);
				
		return "iterate";
	}
}
