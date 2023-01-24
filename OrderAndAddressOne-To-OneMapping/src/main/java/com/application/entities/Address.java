package com.application.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity

public class Address 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	@Column(name="street_name")
	private String street;
	
	@Column(name="city_name")
	private String city;
	private String state;
	
	@Column(name="country_name")
	private String country;
	private String zipCode;
	
	public Address(int id, String street, String city, String state, String country, String zipCode) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	
	public String getStreet()
	{
		return street;
	}
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	
	
	public String getCountry() 
	{
		return country;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}
	
	
	public String getZipCode() 
	{
		return zipCode;
	}
	public void setZipCode(String zipCode) 
	{
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", country="
				+ country + ", zipCode=" + zipCode + "]";
	}
}
