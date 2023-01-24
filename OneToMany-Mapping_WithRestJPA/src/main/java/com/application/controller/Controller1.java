package com.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.application.Repository.CategoryRepo;
import com.application.entities.Category;
import com.application.entities.Products;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
public class Controller1 
{
  @Autowired
  CategoryRepo repo1;
  
   @PostMapping("/category")
   
   public ResponseEntity<Category>createCategory(@RequestBody Category obj1)
   {
	   Category obj2=repo1.save(new Category(obj1.getCategoryName()));
	   
	   return new ResponseEntity<>(obj2,HttpStatus.CREATED);
   }
   
 /**  @PostMapping("/categories/{categoryId}")
   
   public ResponseEntity<Products> createComment(@PathVariable("categoryId")int categoryId,@RequestBody Products obj1)
   {
	   Products obj2= 
   }**/
}//Controller1
