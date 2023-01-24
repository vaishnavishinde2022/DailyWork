package com.application.Repository;

import org.springframework.data.repository.CrudRepository;

import com.application.entities.Address;

public interface AddressRepo extends CrudRepository<Address,Integer>
{

}
