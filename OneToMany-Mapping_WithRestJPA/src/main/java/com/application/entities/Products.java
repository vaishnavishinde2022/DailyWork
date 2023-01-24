package com.application.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Products
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
   private int productId;
	private String productName;
	   
	   @ManyToOne(fetch=FetchType.LAZY,optional=false)
	   @JoinColumn(name="categoryId")
	   @OnDelete(action=OnDeleteAction.CASCADE)
	   private Category category;
	   
	   public Products(int productId, String productName, Category category) 
	   {
			super();
			this.productId = productId;
			this.productName = productName;
			this.category = category;
		}
	   
   public Products()
   {
		super();
		// TODO Auto-generated constructor stub
	}

public int getProductId() 
   {
		return productId;
	}

	public void setProductId(int productId)
	{
		this.productId = productId;
	}

	public String getProductName() 
	{
		return productName;
	}

	public void setProductName(String productName) 
	{
		this.productName = productName;
	}

	public Category getCategory() 
	{
		return category;
	}

	public void setCategory(Category category) 
	{
		this.category = category;
	}

	

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", category=" + category + "]";
	}


}
