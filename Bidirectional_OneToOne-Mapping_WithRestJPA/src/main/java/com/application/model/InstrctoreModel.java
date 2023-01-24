package com.application.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.application.entities.Instructor;
import com.application.entities.InstrctorDetails;
import com.application.repository.InstrctoreRepo;
import com.application.repository.InstrctoreDetailsRepo;
import java.util.ArrayList;
import java.util.Optional;

@Component
public class InstrctoreModel 
{
	@Autowired
	InstrctoreRepo repo1;
	
	@Autowired
	InstrctoreDetailsRepo repo2;
   public Instructor addInstuctor(Instructor obj)
   {
	   Instructor instrctore1;
	   
	   instrctore1=repo1.save(obj);
	   
	   return instrctore1;
   }
   
   public ArrayList<Instructor> getAllInstructors()
   {
	   ArrayList<Instructor> arrayList=null;
	  Iterable<Instructor> itr= repo1.findAll();
	  
	  arrayList=(ArrayList<Instructor>)itr;
	  
	  return arrayList;
	  
   }//getAllInstructors
   
   public ArrayList<InstrctorDetails> getAllInstrctoreDetails()
   {
	   ArrayList<InstrctorDetails> arrayList=null;
	   
	   Iterable<InstrctorDetails> itr=repo2.findAll();
	   
	   /**Optional<InstrctorDetails> op= repo2.findById(1);
	   
	   InstrctorDetails result=op.get();
	   
	   System.out.println("Instructor name:"+result.getInstructor());**/
	   
	   
	   arrayList=(ArrayList<InstrctorDetails>)itr;
	          
	   return arrayList;
	   
	   
   }//getAllInstrctoreDetails
   
   /*
    * This method will show you how to get Instructor from InstrctorDetails.
    */
   public void getInstuctorNameFrominstrctoresDetails()
   {
	   //firstly get Optional by using id
       Optional<InstrctorDetails> op= repo2.findById(1);
	   
       //get InstrctorDetails object from Optional
	   InstrctorDetails result=op.get();
	   
	   //And from InstrctorDetails get instructor which is field in InstrctorDetails class.
	   Instructor instructor=result.getInstructor();
	   
	   System.out.println("instructor first name:"+instructor.getFirst_Name());
	   System.out.println("instructor last name :"+instructor.getLast_Name());
	   System.out.println("instructor email:"+instructor.getEmail());
	   
   }
}
