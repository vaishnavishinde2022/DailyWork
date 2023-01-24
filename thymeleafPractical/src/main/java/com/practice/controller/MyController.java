package com.practice.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController 
{
	@RequestMapping(value="/aboutFile",method=RequestMethod.GET)
	
  public String about(Model model)
  {
	  System.out.println("Inside about handler....");
	  
	  //putting data in model
	  model.addAttribute("name","vaishnavi shinde");
	  model.addAttribute("CurrentDate", new Date());
	  return "about";
	 
  }//about
	
	//handling iteration
	@GetMapping("/example-loop")
	
	public String iterateHandler(Model model)
	{ 
		//create a list
		
		ArrayList arrayList=new ArrayList();
		arrayList.add("java");
		arrayList.add("php");
		arrayList.add("python");
		arrayList.add("c++");
		
		model.addAttribute("programming",arrayList);
		
		return "iterate";
	}//iterateHandler
	
	//handler for conditional statement
	
	@GetMapping("/condition")
	public String conditionalHandler(Model model)
	{
		System.out.println("conditional handler executed....");
		
		model.addAttribute("isActive", false);
		
		return "condition";
	}
}
