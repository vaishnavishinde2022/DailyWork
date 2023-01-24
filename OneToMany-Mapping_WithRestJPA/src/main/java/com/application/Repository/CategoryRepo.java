package com.application.Repository;

import org.springframework.data.repository.CrudRepository;

import com.application.entities.Category;

public interface CategoryRepo extends CrudRepository<Category,Integer>
{

}
