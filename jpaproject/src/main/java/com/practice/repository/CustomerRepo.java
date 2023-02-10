package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer>
{

}
