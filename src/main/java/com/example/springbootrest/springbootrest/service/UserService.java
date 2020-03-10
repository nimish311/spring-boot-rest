package com.example.springbootrest.springbootrest.service;

import java.util.List;

import com.example.springbootrest.springbootrest.model.User;
import com.example.springbootrest.springbootrest.model.UserDto;

public interface UserService {
	
	User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
