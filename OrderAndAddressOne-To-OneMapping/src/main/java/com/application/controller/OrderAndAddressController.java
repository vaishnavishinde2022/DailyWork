package com.application.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.application.model.Model;
import com.application.entities.Order;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class OrderAndAddressController 
{
	@Autowired
	Model modelObj;
     
   @PostMapping("/add")
   
   /**
    * ResponseEntity represents the whole HTTP response:status code,headers and body
    * @RequestBody: annotation maps the HttpRequest body. Enabling automatic deserialization of
    * the inbound HttpRequest body onto a java object.
    * @param orderObj
    * @return
    */
   /*
    * addOrder method is use to handle PostMapping request to add Order
    */
   public ResponseEntity<Order> addOrder(@RequestBody Order orderObj)
   {
	   Order result;
	   
	   try
	   {
	    result=modelObj.addOrder(orderObj);
	    
	    return ResponseEntity.of(Optional.of(result));
	    
	   }//try
	   
	   catch(Exception e)
	   {
		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
	   }
	   
	   
   }//addOrder
   
  
   @GetMapping("/get/{id}")
   /*
    * getOrder method is use to handle GetMapping request to retrive Order by id
    */
   public ResponseEntity<Order> getOrder(@PathVariable("id")int id )
   {
	   Order orderObj;
	   
	   try
	   {
	     orderObj=modelObj.getOrder(id);
	     
	     return ResponseEntity.of(Optional.of(orderObj));
	   
	   }//try
	   
	   catch(Exception e)
	   {
	     return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	   }//catch
	   
   }//getOrder
   
   
   @GetMapping("/getorders")
   /*
    * getOrders method is use to handle GetMapping request to retrive all Orders.
    */
   public ResponseEntity<ArrayList<Order>> getOrders()
   {
	   ArrayList<Order> orderList;
	   
	   try
	   {
		   orderList= modelObj.getOrders(); 
		   
		   return ResponseEntity.of(Optional.of(orderList));
	   }//try
	   
	   catch(Exception e)
	   {
		 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	   }
   }//getOrders
   
   
   @PutMapping("/updateTotalPrice/{id}/{totalprice}")
   /*
    * updateOrderTotalPrice method is use to handle PutMapping request to update totalPrice of perticular order.
    */
   public ResponseEntity<Order> updateOrderTotalPrice(@PathVariable("id")int id,@PathVariable("totalprice")int totalprice)
   {
	   Order orderObj1;
	   
	   try
	   {
		   orderObj1= modelObj.updateTotalPrice(id,totalprice); 
		   
		   return ResponseEntity.of(Optional.of(orderObj1));
	   }//try
	   
	   catch(Exception e)
	   {
		 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();  
	   }
	   
   }//updateOrder
   
   @PutMapping("/updatecity/{id}/{city}")
   /*
    * updateOrderCity method is use to handle PutMapping request to update city of perticular order.
    */
   public ResponseEntity<Order> updateOrderCity(@PathVariable("id")int id,@PathVariable("city")String city)
   {
	   Order orderObj1;
	   
	   try
	   {
		   System.out.println(city);
		   orderObj1= modelObj.updateOrderCity(id,city);
		   return ResponseEntity.of(Optional.of(orderObj1));
	   }//try
	   
	   catch(Exception e)
	   {
		 return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	   }
	   
   }//updateOrderCity
   
   
   @DeleteMapping("/delete/{id}")
   /*
    * deleteOrder method is use to handle DeleteMapping request to delete perticular order .
    */
   public ResponseEntity<String> deleteOrder(@PathVariable("id")int id)
   {
	   String msg="";
	   try
	   {
	     msg=modelObj.deleteOrder(id); 
	     
	     return ResponseEntity.of(Optional.of(msg));
	   
	   }//try
	   
	   catch(Exception e)
	   {
		   return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	   }
   }//deleteOrder
   
}//class
