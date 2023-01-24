package com.api.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;



@Component
public class BookService
{
   private static List<Book> list=new ArrayList<>();
   
   static
   {
	   list.add(new Book("complete Reference",150,"Herbert Schildt",1000));
	   list.add(new Book("Core and Advance java",1255,"Cay S.Horstmann",1000));
   }//static block
   
   //get all books
   public List<Book> getAllBooks()
   {
	   return list;
   }
}
