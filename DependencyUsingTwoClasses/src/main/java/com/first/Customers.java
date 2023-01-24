package com.first;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Scanner;

@Component
public class Customers
{
	
	private int custId;
	   private String custName;
	   private String courseName;
	   
	   @Autowired
	   private Technologies techObj;
	   
	 
	
	
	   
   public Technologies getTechObj()
   {
		return techObj;
	}
   
	public void setTechObj(Technologies techObj) 
	{
		this.techObj = techObj;
	}
	
  public int getCustId() 
   {
		return custId;
	}
	public void setCustId(int custId)
	{
		this.custId = custId;
	}
	
	
	public String getCustName()
	{
		return custName;
	}
	public void setCustName(String custName)
	{
		this.custName = custName;
	}
	
	
	
	public String getCourseName()
	{
		return courseName;
	}
	public void setCourseName(String courseName) 
	{
		this.courseName = courseName;
	}

   public void dispaly()
   {
	  
	   System.out.println("Customers object retured succeessfully...");
	   System.out.println("Customer name:"+this.custName);
	   System.out.println("Customer id:"+this.custId);
	   System.out.println("Course name:"+this.courseName);
	   
	   techObj.tech();
   }
   
}
