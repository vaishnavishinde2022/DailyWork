package com.application.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;


@Entity

public class Order 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
   private int id;
	private int orderTrackingNumber;
	private String status;
	private int totalPrice;
	private int totalQuantity;
	
	@OneToOne(cascade=CascadeType.ALL)
	/*
	 * @JoinColumn annotation is to marks a column as a join column for an entity association
	 */
	@JoinColumn(name="Address_id",referencedColumnName="id")
	Address address;
	
	public Order(int id, int orderTrackingNumber, String status, int totalPrice, int totalQuantity, Address address) 
	{
		super();
		this.id = id;
		this.orderTrackingNumber = orderTrackingNumber;
		this.status = status;
		this.totalPrice = totalPrice;
		this.totalQuantity = totalQuantity;
		this.address = address;
	}
	
	public Order() {
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

	public int getOrderTrackingNumber() 
	{
		return orderTrackingNumber;
	}

	public void setOrderTrackingNumber(int orderTrackingNumber) 
	{
		this.orderTrackingNumber = orderTrackingNumber;
	}
	

	public String getStatus() 
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}

	
	public int getTotalPrice() 
	{
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) 
	{
		this.totalPrice = totalPrice;
	}
	

	public int getTotalQuantity() 
	{
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) 
	{
		this.totalQuantity = totalQuantity;
	}

	
	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address address) 
	{
		this.address = address;
	}

	@Override
	public String toString() 
	{
		return "Order [id=" + id + ", orderTrackingNumber=" + orderTrackingNumber + ", status=" + status
				+ ", totalPrice=" + totalPrice + ", totalQuantity=" + totalQuantity + ", address=" + address + "]";
	}



	
	
}
