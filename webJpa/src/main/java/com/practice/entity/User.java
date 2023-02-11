package com.practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.stereotype.Component;

@Entity
@Component
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	private String name;
	private String email;
	private String username;
	private String password;
	
	public User(String name, String email, String username, String password) 
	{
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	public User() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId()
	{
		return id;
	}
	

	@Override
	public String toString() 
	{
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", username=" + username + ", password="
				+ password + "]";
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
	
	
}//User
