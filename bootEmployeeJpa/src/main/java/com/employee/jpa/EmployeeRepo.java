package com.employee.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepo extends CrudRepository<Employee,Integer>
{

}
