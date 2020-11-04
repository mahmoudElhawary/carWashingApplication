package com.car.washing.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.washing.domain.Response;
import com.car.washing.model.ContactUs;
import com.car.washing.model.Driver;
import com.car.washing.model.User;
import com.car.washing.service.ContactUsService;
import com.car.washing.service.DriverService;

@RestController
public class AdminController {

	@Autowired
	private DriverService driverService;

	@GetMapping("/getDrivers")
	public ResponseEntity<List<Driver>> getAllDrivers() {
		List<Driver> drivers = driverService.findAll();
		return new ResponseEntity<List<Driver>>(drivers, HttpStatus.OK);
	}
	
	@PostMapping("/setDriver")
	public ResponseEntity<List<Driver>> setDriver(@RequestBody User user) {
		if (user != null) {
			Driver driver = new Driver();
			driver.setEmail(user.getEmail());
			driver.setFullName(user.getFullName());
			driver.setPhoneNumber(user.getPhoneNumber());
			driver.setOnline(true);
			driverService.save(driver);
			List<Driver> drivers = driverService.findAll();
			return new ResponseEntity<List<Driver>>(drivers, HttpStatus.OK);
		} else {
			return null;
		}
	}
}
