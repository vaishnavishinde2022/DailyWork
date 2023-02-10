package com.practice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private String email;
  private String city;
  private String username;
  private String password;
 
  public Customer(int id, String name, String email, String city, String username, String password)
  {
  	super();
  	this.id = id;
  	this.name = name;
  	this.email = email;
  	this.city = city;
  	this.username = username;
  	this.password = password;
  }
  
public Customer()
{
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() 
{
	return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", username=" + username
			+ ", password=" + password + "]";
}

public int getId() 
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}


public String getName() 
{
	return name;
}
public void setName(String name)
{
	this.name = name;
}


public String getEmail() 
{
	return email;
}
public void setEmail(String email)
{
	this.email = email;
}


public String getCity()
{
	return city;
}
public void setCity(String city) 
{
	this.city = city;
}


public String getUsername() 
{
	return username;
}
public void setUsername(String username) 
{
	this.username = username;
}


public String getPassword()
{
	return password;
}
public void setPassword(String password)
{
	this.password = password;
}


}//Customer
