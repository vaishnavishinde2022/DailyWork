package com.practice.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class MyController 
{
   @GetMapping("/gotoConditional")
   public String conditionHandler(Model model)
   {
	   ArrayList<Integer> arrylist=new ArrayList<Integer>();
	   
	   arrylist.add(233);
	   arrylist.add(43);
	   arrylist.add(53);
	   arrylist.add(6456);
	   arrylist.add(64);
	   
	   model.addAttribute("isActive",false);
	   
	   model.addAttribute("gender","M");
	   	   	   
	   model.addAttribute("mylist",arrylist);
	   
	   return "condition";
   }
}
