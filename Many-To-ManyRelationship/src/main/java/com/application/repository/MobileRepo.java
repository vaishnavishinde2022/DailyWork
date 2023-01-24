package com.application.repository;

import org.springframework.data.repository.CrudRepository;
import com.application.entities.Mobile;

public interface MobileRepo extends CrudRepository<Mobile,Integer>
{

}
