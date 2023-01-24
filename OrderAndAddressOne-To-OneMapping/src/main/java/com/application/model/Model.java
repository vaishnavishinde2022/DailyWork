package com.application.model;
import org.springframework.beans.factory.annotation.Autowired;

import com.application.entities.Order;
import com.application.entities.Address;
import com.application.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;
@Component
public class Model 
{
	@Autowired
	OrderRepo repo;
	
  public Order addOrder(Order orderObj)
  {
	 Order result=repo.save(orderObj); 
	 
	 return result;
  }//addOrder
  
  public Order getOrder(int id)
  {
	  Order result;
	  Optional<Order> op=repo.findById(id);
	  
	  result=op.get();
	  
	  return result;
	  
  }//getOrder
  
  public ArrayList<Order> getOrders()
  {
	  ArrayList<Order> orderList;
	  
	  Iterable<Order> itr=repo.findAll();
	  
	  orderList=(ArrayList<Order>)itr;
	  
	  return orderList;
	  
  }//getOrders
  
  public Order updateTotalPrice(int id,int totalPrice)
  {
	  Order orderObj1;
	
	 
	  Optional<Order> op=repo.findById(id);
	  
	  orderObj1=op.get();
	  
	 // orderObj1.setTotalPrice(orderObj.getTotalPrice());
	  
	  orderObj1.setTotalPrice(totalPrice);
	  
	  Order result=repo.save(orderObj1);
	  
	  return result;
	  
  }//updateTotalPrice
  
  public Order updateOrderCity(int id,String city)
  {
	  Order orderObj1;
	  
	  Address addressObj;
	  
	  Optional<Order> op=repo.findById(id);
	  
	  orderObj1=op.get();
	  
	   addressObj=orderObj1.getAddress();
	   
	   addressObj.setCity(city);
	   
	   Order result=repo.save(orderObj1);
	   
	   return result;
	   
  }//updateOrderCity
  
  public String deleteOrder(int id)
  {
	  repo.deleteById(id);
	  
	  return "record deleted";
  }
}
