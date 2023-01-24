package com.first;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User 
{
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
  private int userId;
	private String userName;
	  private String city;
	  
	  public User(int userId, String userName, String city)
		{
			super();
			this.userId = userId;
			this.userName = userName;
			this.city = city;
		}

  public int getUserId()
  {
		return userId;
  }
	public void setUserId(int userId) 
	{
		this.userId = userId;
	}
	
	
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public User() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() 
	{
		return "User [userId=" + userId + ", userName=" + userName + ", city=" + city + "]";
	}
	

}
