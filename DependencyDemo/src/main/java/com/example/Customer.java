package com.example;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class Customer
{
	
   private int custid;
   private String custname;
   private String address;
   
   
   
   public int getCustid()
   {
	return custid;
  }
  public void setCustid(int custid)
  {
	this.custid = custid;
  }
  
  @RequestMapping("/customer")
public String getCustname() 
{
	return custname;
}
public void setCustname(String custname)
{
	this.custname = custname;
}


 public String getAddress()
 {
	return address;
 }
public void setAddress(String address)
{
	this.address = address;
}

 public void dispaly()
 {
	 System.out.println("Customers object retured successfully..");
 }
 
 
   
}
