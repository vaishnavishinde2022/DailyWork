package com.application.model;

import org.springframework.stereotype.Component;
import com.application.entities.Person;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import com.application.repository.PersonRepo;
import java.util.Optional;

@Component
public class Model 
{
	@Autowired
	PersonRepo repo1;
  public Person addPerson(Person perObj)
  {
	Person personObj =repo1.save(perObj); 
	
	return personObj;
  }//addPerson
  
  public ArrayList<Person> getAllPersons()
  {
	  ArrayList<Person> personList;
	  
	  Iterable<Person> itr=repo1.findAll();
	  
	  personList=(ArrayList<Person>) itr;
	  
	  return personList;
	  
  }//getAllPersons
  
  public Person updatePerson(Person perObj,int id)
  {
	  Person perObj1;
	  Optional<Person> op=repo1.findById(id); 
	  
	   perObj1=op.get();
	   
	   System.out.println(perObj1);
	   
	   perObj1.setPersonName(perObj.getPersonName());
	   
	   Person result=repo1.save(perObj1);
	  
	  return result;
	  
  }//updatePerson
  
  public Person getPerson(int id)
  {
	  Person perObj1;
	  Optional<Person> op=repo1.findById(id); 
	  
	  perObj1=op.get();
	  
	  return perObj1;
	  
  }//getPerson
  
  public String deletePerson(int id)
  {
	 repo1.deleteById(id);
	 return "deleted";
  }
}
