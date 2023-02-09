package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController 
{
	@RequestMapping(value="/aboutRegistration",method=RequestMethod.GET)
   public String about(Model model)
   {
	   System.out.println("Inside about handlet...");
	   
	   	   
	   return "registration";
   }
	
	@PostMapping("/details")
	
	public String showDetails(@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("username")String username,@RequestParam("password")String password,Model model)
	{
		model.addAttribute("name",name);
		model.addAttribute("userEmail",email);
		model.addAttribute("username",username);
		model.addAttribute("userpassword",password);
		
		return "about1";
	}
}
