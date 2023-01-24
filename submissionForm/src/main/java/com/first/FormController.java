package com.first;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

@Controller
public class FormController 
{
  @GetMapping("/")
  
  public String formController()
  {
	 return "getCustInfo.jsp"; 
  }
  
  @PostMapping("/details")
  
  public String viewDeatail(@RequestParam("custName")String custName,@RequestParam("custEmail") String custEmail,@RequestParam("custId") String custId , ModelMap modelMap)
  {
	 modelMap.put("custName", custName);
	 modelMap.put("custEmail", custEmail);
	 modelMap.put("custId", custId);
	 
	 return "viewCustomerInfo.jsp";
	 
  }
  
}
