package com.car.washing.service;

import java.util.List;

import com.car.washing.model.Driver;

public interface DriverService {

	List<Driver> findAll();
	Driver save(Driver driver);
}
