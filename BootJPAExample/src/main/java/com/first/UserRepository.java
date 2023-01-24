package com.first;
import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User,Integer>
{
   public List<User> findByUserName(String name);
   
   public List<User> findByUserNameAndCity(String name,String city);
   
   public List<User> findByUserNameStartingWith(String prefix);
   
   public List<User> findByUserNameEndingWith(String suffix);
   
   public List<User> findByUserNameOrderByUserName(String name);
}
