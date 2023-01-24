package com.application.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Address")
public class Address 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
   private int addressId;
   private String city;
	private String addressType;
	
	public Address(int addressId, String city, String addressType) 
	{
		super();
		this.addressId = addressId;
		this.city = city;
		this.addressType = addressType;
	}
	
   public Address() 
   {
		super();
		// TODO Auto-generated constructor stub
	}

public int getAddressId()
   {
		return addressId;
	}
	public void setAddressId(int addressId)
	{
		this.addressId = addressId;
	}
	
	
	public String getCity()
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	
	public String getAddressType()
	{
		return addressType;
	}
	public void setAddressType(String addressType) 
	{
		this.addressType = addressType;
	}
	
	@Override
	public String toString() 
	{
		return "Address [addressId=" + addressId + ", city=" + city + ", addressType=" + addressType + "]";
	}
	
	

}
