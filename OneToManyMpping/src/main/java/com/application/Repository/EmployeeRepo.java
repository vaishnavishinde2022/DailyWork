package com.application.Repository;

import org.springframework.data.repository.CrudRepository;
import com.application.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee,Integer>
{

}
