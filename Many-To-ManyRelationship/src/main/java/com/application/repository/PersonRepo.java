package com.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.application.entities.Person;

public interface PersonRepo  extends CrudRepository<Person,Integer>
{

}
