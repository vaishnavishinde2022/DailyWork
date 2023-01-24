package com.book.model;

import org.springframework.stereotype.Component;
import com.book.entity.Book;
import java.util.ArrayList;

@Component
public class Model 
{
	static ArrayList<Book> arrayList=new ArrayList();
	
	static
	{
		arrayList.add(new Book(1,"abc","autor"));
		arrayList.add(new Book(2,"pqr","autor"));
	}
  public ArrayList<Book> allBooks()
  {
	  return arrayList;
  }
  
}//Model
