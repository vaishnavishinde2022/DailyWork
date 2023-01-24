package com.employee.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*
 * @Controller to indicate that class is a front controller and resposible to handle use requests
 * and return appropriate response.
 */
@Controller
/*
 * Bellow class is a basically Controller class to handle user requests.
 * This class contains takeEmpInfo(),retrive(),update(),delete() methods etc.
 * This controller takes data from user i.e from employee.jsp file and transforms to Model.
 */
public class EmployeeController1
{
	/*
	 * @Autowired is use for dependency injection.
	 */
	@Autowired
	//obj is a reference variable of model i.e EmpModel class.
	EmpModel modelobj;
	
	/*
	 * @RequestMapping annotation is used to process HTTP request with specified URL pattern.
	 */
	@RequestMapping("/employee")
   public String showEmpJsp()
   {
	   return "employee.jsp";
   }
	
	@PostMapping("/details")
	
	public String takeEmpInfo(@RequestParam("Name")String Name,@RequestParam("Email") String Email,@RequestParam("Address")String Address,@RequestParam("Department")String Department,@RequestParam("Designation")String Designation,ModelMap modelmap)
	{
	  String msg= modelobj.saveEmpInfo(Name,Email,Address,Department,Designation);
	  
	  if(msg.equals("saved"))
	  {
		 
		  modelmap.put("Name", Name);
		  modelmap.put("Email", Email);
		  modelmap.put("Department",Department );
		  modelmap.put("Designation",Designation );
		  
		  return "employee.jsp";
		  
		  
		  
	  }
	  
	  return "error.jsp";
	}//takeEmpInfo
	
	@PostMapping("/retrive")
	public String retrive(@RequestParam("Id") String Id ,@RequestParam("Name") String Name,ModelMap modelmap)
	{
		int id=Integer.valueOf(Id);
		
		Employee emp=modelobj.retriveEmpInfo(id, Name);
		
		
		String empName=emp.getName();
		int empId=emp.getId();
		String empEmail=emp.getEmail();
		String empDesignation=emp.getDesignation();
		String empDepartment=emp.getDepartment();
		String empAddress=emp.getAddress();
		
		modelmap.put("empName", empName);
		modelmap.put("empId", empId);
		modelmap.put("empEmail", empEmail);
		modelmap.put("empDesignation", empDesignation);
		modelmap.put("empDepartment", empDepartment);
		modelmap.put("empAddress", empAddress);
		
		return "employeeInfo.jsp";
		
		
		
	
	}//retrive
	
	@PostMapping("/update")
	
	public String update(@RequestParam("Id") String Id ,@RequestParam("Name") String Name,@RequestParam("Address") String Address,ModelMap modelmap)
	{
		int id=Integer.valueOf(Id);
		String msg=modelobj.update(id, Name,Address);
		if(msg.equals("updated"))
		{
		return "employee.jsp";
		}
		
		return "error.jsp";
	}//update
	
	@PostMapping("/delete")
	public String delete(@RequestParam("Id") String Id ,@RequestParam("Name") String Name,ModelMap modelmap)
	{
		int id=Integer.valueOf(Id);
		
		String msg=modelobj.delete(id, Name);
		
		if(msg.equals("deleted"))
		{
		
		return "employee.jsp";
		}//if
		
		return "error.jsp";
	}
}// class EmployeeController1
