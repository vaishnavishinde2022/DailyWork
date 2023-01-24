package com.api.book;


public class Book 
{
   private String name;
   private int price;
   private String author;
   private int pages;
   
public Book(String name, int price, String author, int pages) 
{
	super();
	this.name = name;
	this.price = price;
	this.author = author;
	this.pages = pages;
}

public Book() {
	super();
	// TODO Auto-generated constructor stub
}

public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}


public int getPrice() 
{
	return price;
}

public void setPrice(int price) 
{
	this.price = price;
}


public String getAuthor() 
{
	return author;
}

public void setAuthor(String author) 
{
	this.author = author;
}


public int getPages() 
{
	return pages;
}

public void setPages(int pages) 
{
	this.pages = pages;
}

@Override
public String toString() {
	return "Book [name=" + name + ", price=" + price + ", author=" + author + ", pages=" + pages + "]";
}




}//class
