package com.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.application.entities.Order;
import org.springframework.stereotype.Component;
@Component
public interface OrderRepo extends CrudRepository<Order,Integer>
{

}
