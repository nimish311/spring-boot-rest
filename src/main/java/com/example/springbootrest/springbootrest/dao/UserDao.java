package com.example.springbootrest.springbootrest.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootrest.springbootrest.model.User;

public interface UserDao extends CrudRepository<User, Integer>{
	User findByUsername(String username);

}
