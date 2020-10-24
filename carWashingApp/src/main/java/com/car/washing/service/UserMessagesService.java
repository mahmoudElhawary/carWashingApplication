package com.car.washing.service;

import java.util.List;

import com.car.washing.model.UserMessages;

public interface UserMessagesService {

	List<UserMessages> findAll() ;
	
	void delete(Long id) ;
	
	void deleteAll() ;

	List<UserMessages> findAllByUserId(Long id) ;
	
	List<UserMessages> findAllBySenderId(Long id) ;
	
	List<UserMessages> findAllByUserIdAndSenderId(Long userId , Long senderId) ;
	
	UserMessages save(UserMessages messages) ;
	
	UserMessages findById(Long id) ;
	
	
}
