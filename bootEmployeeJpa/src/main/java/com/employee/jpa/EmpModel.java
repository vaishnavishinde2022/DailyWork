package com.employee.jpa;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/*
 * @Component annotation is used to denote a class as a component.
 * 
 * Bellow EmpModel class is a model in MVC  to interact with database.
 */
@Component

public class EmpModel 
{
	/*
	 * @Autowired annotation is used for dependency injection at run time.
	 */
	@Autowired
	//obj is a reference variable of repository i.e.EmployeeRepo interface.
	EmployeeRepo empRepoobj;
   public String saveEmpInfo(String Name,String Email,String Address,String Department,String Designation)
   {
	   Employee emp1=new Employee();
	   
	   emp1.setName(Name);
	   emp1.setEmail(Email);
	   emp1.setAddress(Address);
	   emp1.setDepartment(Department);
	   emp1.setDesignation(Designation);
	   
	   empRepoobj.save(emp1);
	   return "saved";
	   
	  
	   
	   
   }//saveEmpInfo
   
   public Employee retriveEmpInfo(int id,String name)
   {
	   Optional<Employee> optional=empRepoobj.findById(id);
	   
	   Employee emp2=optional.get();
	   
	  return emp2; 
   }//retriveEmpInfo
   
   
   public String update(int id,String name,String address)
   {
	   Optional<Employee> optional=empRepoobj.findById(id);
	   
	   Employee emp2=optional.get();
	   
	   emp2.setAddress(address);
	   
	   empRepoobj.save(emp2);
	   
	   return "updated";
   }//update
   
   
   public String delete(int id,String name)
   {
	   empRepoobj.deleteById(id);
	   return "deleted";
   }//deleted
}
