package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.application.entities.Employee;
import com.application.model.Model;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class EmpController 
{
	@Autowired
	Model modelObj;
	
	//@PostMapping to create a new employee
  @PostMapping("/empSave")
  
  public ResponseEntity<Object> createEmp(@RequestBody Employee empObj )
  {
	  Employee empObj1=null;
	  
	  try
	  {
		  	  
		  empObj1=modelObj.createEmp(empObj);
	  
	  return ResponseEntity.of(Optional.of(empObj));
	  
	  }//try
	  
	  catch(Exception e)
	  {
		 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
	  }
	  
  }//createEmp
  
  //@GetMapping to get all employee's data
  @GetMapping("/empInfo")
  
  public ResponseEntity< ArrayList<Employee> > getAllEmp()
  {
	  ArrayList<Employee> arrayList=null;
	  
	  try
	  {
	  
	  arrayList=modelObj.getAllEmp();
	  
	  return ResponseEntity.of(Optional.of(arrayList));
	  
	  }//try
	  
	  catch(Exception e)
	  {
		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	  }
  }//getAllEmp
  
  
  //@PutMapping is to update employee
  @PutMapping("/update/{EmpId}")
  
  public ResponseEntity<Employee>updateEmployee(@RequestBody Employee empObj,@PathVariable("EmpId")int EmpId)
  {
	  Employee empObj1=null;
	  
	  try
	  {
		  empObj1=modelObj.updateEmp(empObj,EmpId); 
		  
		  return ResponseEntity.of(Optional.of(empObj1));
	  }//try
	  
	  catch(Exception e)
	  {
		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	  }//catch
  }//updateEmployee
  
  //@DeleteMapping is to delete employee
  @DeleteMapping("/delete/{id}")
  
  public ResponseEntity<String> deleteEmp(@PathVariable("id")int id)
  {
	  
	  
	  try
	  {
		  String msg=modelObj.deleteEmp(id);
		 return  ResponseEntity.of(Optional.of(msg)); 
	  }//try
	  
	  catch(Exception e)
	  {
		 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();  
	  }
  }//deleteEmp
  
	  
  
  
}
