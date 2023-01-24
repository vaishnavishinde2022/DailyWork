package com.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import com.book.model.Model;

@RestController
public class BookController 
{
	@Autowired
	Model modelObj;
  /**@GetMapping("/book")
  
  public String book()
  {
	  return "java book";
  }**/
  
  @GetMapping("/books")
  
  public ArrayList allBooks()
  {
	  ArrayList arrayList=modelObj.allBooks();
	  
	  return arrayList;
  }
}
