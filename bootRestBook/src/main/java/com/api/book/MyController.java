package com.api.book;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController
public class MyController 
{
	@Autowired
	private BookService bookService;
	
	@GetMapping("/home")
   public String home()
   {
	   return "Hello world";
   }
	
	//get the books
	
	/**@GetMapping("/books")
	public Book getBook()
	{
		Book book1=new Book();
		book1.setName("java");
		book1.setPrice(100);
		book1.setPages(500);
		book1.setAuthor("abc");
		return book1;
		
	}**/
	
	@GetMapping("/books")
	public List<Book> getBook()
	{
		return bookService.getAllBooks();
		
	}
	
}
