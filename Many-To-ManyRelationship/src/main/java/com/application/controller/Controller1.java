package com.application.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.application.model.Model;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.application.entities.Person;

@RestController
public class Controller1
{
  @Autowired
  Model modelObj;
  
  @PostMapping("/post")
  
  public ResponseEntity<Person> addPerson(@RequestBody Person perObj)
  {
	  Person perObj1;
	  
	  try
	  {
		  perObj1=modelObj.addPerson(perObj); 
		  
		  return ResponseEntity.of(Optional.of(perObj1));
	  
	  }//try
	  
	  catch(Exception e)
	  {
		 return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	  }//catch
  }//addPerson
  
   @GetMapping("/getpersons")
   
   public ResponseEntity<ArrayList<Person>>getAllPersons()
   {
	   ArrayList<Person> personList;
	   
	   try
	   {
		   personList= modelObj.getAllPersons();
		   
		   return ResponseEntity.of(Optional.of(personList));
	   
	   }//try
	   
	   catch(Exception e)
	   {
		 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();  
	   }//catch
	   
   }//getAllPersons
   
   @PutMapping("/update/{id}")
   
   public ResponseEntity<Person> updatePerson(@RequestBody Person perObj,@PathVariable("id")int id )
   {
	   Person perObj1;
	   
	   try
	   {
		   perObj1=modelObj.updatePerson(perObj,id); 
		   
		   return ResponseEntity.of(Optional.of(perObj1));
	   }//try
	   
	   catch(Exception e)
	   {
		  return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	   }//catch
	   
	   
   }//updatePerson
   
   @GetMapping("/person/{id}")
   
   public ResponseEntity<Person> getPerson(@PathVariable("id")int id)
   {
	   Person perObj;
	   
	   perObj=modelObj.getPerson(id); 
	   
	   return ResponseEntity.of(Optional.of(perObj));
	   
   }//getPerson
   
   @DeleteMapping("/delete/{id}")
   
   public ResponseEntity<String> deletePerson(@PathVariable("id")int id)
   {
	   String msg=modelObj.deletePerson(id);
	   
	   return ResponseEntity.of(Optional.of(msg));
   }
   
}//Controller1
