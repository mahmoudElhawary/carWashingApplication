package com.car.washing.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.car.washing.domain.Response;
import com.car.washing.model.User;
import com.car.washing.service.UserService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class PreLoginController {

	@Autowired
	private UserService userService;

	//@RequestParam("userFile") MultipartFile userFile
	@PostMapping("/signup")
	public ResponseEntity<List<User>> signup(@RequestParam("user") String user
			) throws JsonParseException, JsonMappingException, IOException {
		// get product data from rest api
		if (user != null) {
			User userData = new ObjectMapper().readValue(user, User.class);
//			userData.setUserPhoto(userFile.getBytes());
			userData.setCreatedDate(new Date());
			userService.save(userData);
			List<User> users = userService.findAll() ;
			return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		} else {
			return null;
		}
	}
	
	@PostMapping("/signupPostman")
	public ResponseEntity<List<User>> signupPostman(@RequestBody User user) throws JsonParseException, JsonMappingException, IOException {
		// get product data from rest api
		if (user != null) {
			user.setCreatedDate(new Date());
			userService.save(user);
			List<User> users = userService.findAll() ;
			return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		} else {
			return null;
		}
	}

	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
		return new ResponseEntity<User>(userService.getUser(id), HttpStatus.OK);
	}

	@PostMapping("/update")
	public ResponseEntity<Response> update(@RequestBody User user) {
		User userDB = userService.updateUser(user);
		if (userDB != null) {
			return new ResponseEntity<Response>(new Response("user is sigup successfully"), HttpStatus.OK);
		} else {
			return null;
		}
	}
}
