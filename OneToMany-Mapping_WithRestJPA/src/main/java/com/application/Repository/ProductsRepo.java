package com.application.Repository;

import org.springframework.data.repository.CrudRepository;

import com.application.entities.Products;

public interface ProductsRepo extends CrudRepository<Products,Integer>
{

}
