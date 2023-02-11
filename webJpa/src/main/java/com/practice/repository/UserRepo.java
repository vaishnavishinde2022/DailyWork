package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.practice.entity.User;
@Component
public interface UserRepo extends JpaRepository<User,Integer>
{

}
