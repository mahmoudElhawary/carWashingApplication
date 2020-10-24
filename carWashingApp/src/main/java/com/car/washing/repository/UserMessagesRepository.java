package com.car.washing.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.car.washing.model.UserMessages;

@Repository
public interface UserMessagesRepository extends CrudRepository<UserMessages, Long>{

	List<UserMessages> findAllByUserIdOrderByMessageDateDesc(Long id) ;
	List<UserMessages> findAllBySenderIdOrderByMessageDateDesc(Long id) ;
	List<UserMessages> findAllByUserIdAndSenderIdOrderByMessageDateDesc(Long userId , Long senderId) ;
}
