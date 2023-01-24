package com.application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.application.entities.Instructor;
import com.application.entities.InstrctorDetails;
import com.application.model.InstrctoreModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import java.util.ArrayList;

@RestController
public class Controller
{
	@Autowired
	InstrctoreModel model1Obj;
 /** @GetMapping("/hello")
  
  public String hello()
  {
	  return "Hello world";
  }**/
  
  @PostMapping("/add")
  
  public ResponseEntity<Instructor> addInstructore(@RequestBody Instructor instrctoreObj1 )
  {
	  Instructor instrctoreObj=null;
	  
	  try
	  {
	  instrctoreObj= model1Obj.addInstuctor(instrctoreObj1);
	  
	  return ResponseEntity.of(Optional.of(instrctoreObj));
	  
	  }//try
	  
	  catch(Exception e)
	  {
		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	  }
	  
  }//addInstructore
  
  @GetMapping("/instrctores")
  
  public ResponseEntity<ArrayList<Instructor>> getAllInstructors()
  {
	  ArrayList<Instructor> arrayList; 
	  
	  try
	  {
		  arrayList= model1Obj.getAllInstructors();
		  return ResponseEntity.of(Optional.of(arrayList));
		  
	  }//try
	  
	  catch(Exception e)
	  {
		 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	  }//catch
	  
  }//getAllInstructors
  
  @GetMapping("/instrctoresDetails")
  public ResponseEntity<ArrayList<InstrctorDetails>> getAllInstrctoreDetails()
  {
	  ArrayList<InstrctorDetails> arrayList; 
	  
	  try
	  {
		  arrayList=model1Obj.getAllInstrctoreDetails();
		  
		  return ResponseEntity.of(Optional.of(arrayList));
	  }//try
	  
	  catch(Exception e)
	  {
		 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	  }
  }//getAllInstrctoreDetails
  
  @GetMapping("/getInstuctorNameFrominstrctoresDetails")
  
  public void getInstuctorNameFrominstrctoresDetails()
  {
	  model1Obj.getInstuctorNameFrominstrctoresDetails();
  }
  
}//Controller class
