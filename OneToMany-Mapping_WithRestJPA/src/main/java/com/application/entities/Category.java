package com.application.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Category 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
   private int categoryId;
	private String categoryName;
	   
	   //many products
	   
	  // @OneToMany(mappedBy="category",cascade=CascadeType.ALL )
	   
	  // private Set<Products> productList;
	   

		public Category( String categoryName) 
		{
			super();
			//this.categoryId = categoryId;
			this.categoryName = categoryName;
			
		}
		
		public Category()
		{
			super();
			// TODO Auto-generated constructor stub
		}
		
   public int getCategoryId() 
   {
		return categoryId;
	}

	public void setCategoryId(int categoryId) 
	{
		this.categoryId = categoryId;
	}

	public String getCategoryName()
	{
		return categoryName;
	}

	public void setCategoryName(String categoryName) 
	{
		this.categoryName = categoryName;
	}

/**	public Set<Products> getProductList()
	{
		return productList;
	}

	public void setProductList(Set<Products> productList)
	{
		this.productList = productList;
	}**/

	
	/**@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", productList=" + productList
				+ "]";
	}**/


}
