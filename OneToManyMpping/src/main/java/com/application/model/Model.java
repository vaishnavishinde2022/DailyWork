package com.application.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.application.Repository.EmployeeRepo;
import com.application.entities.Address;
import com.application.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class Model 
{
	@Autowired
	EmployeeRepo repo1;
	
  public Employee createEmp( Employee emp)
  {
	  Employee result= repo1.save(emp); 
	
	  return result;
  }//createEmp
  
  
  public ArrayList<Employee> getAllEmp()
  {
	  ArrayList<Employee> arrayList=null;
	 Iterable<Employee> itr=repo1.findAll(); 
	 
	 arrayList=(ArrayList<Employee>) itr;
	 
	 return arrayList;
	 
  }//getAllEmp
  
  public Employee updateEmp(Employee empObj,int id)
  {
	String city="";
	  
	  /**Optional<Employee> optional=repo1.findById(id);
	  Employee emp= optional.get();
	  
	  emp.setAddress(empObj.getAddress());
	  Employee result=repo1.save(emp);
	  
	  return result;**/
	 List<Address> list1= empObj.getAddress();
	 for(int i=0;i<list1.size();i++)
	 {
		 Address address1=list1.get(i);
		 city=address1.getCity();
	 }
	  
	  Optional<Employee> optional=repo1.findById(id);
	  Employee emp= optional.get();
	  
	  List<Address> list=emp.getAddress();
	  
	  for(int i=0;i<list.size()-1;i++)
	  {
		  Address address=list.get(i);
		  
		  address.setCity(city);
	  }
	  
	 Employee resultl= repo1.save(emp);
	 
	 return resultl;
	  
	/** Optional<Employee> optional=repo1.findById(id);
	  Employee emp= optional.get();
	  
	  emp.setDesignation(empObj.getDesignation());
	  
	  Employee result=repo1.save(emp);
	  
	  return result;**/
	 
  }//updateEmp
  
  public String deleteEmp(int id)
  {
	repo1.deleteById(id);
	
	return "deleted";
	
  }//deleteEmp
  
}//Model
