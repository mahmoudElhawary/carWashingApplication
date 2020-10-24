package com.car.washing.service;

import java.util.List;

import com.car.washing.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

	Iterable<User> getUsers() ;
	
	User getUserByEmail(String email);

	User getUser(Long id);

	User updateUser(User userDB);

	User findOne(Long id);

}
