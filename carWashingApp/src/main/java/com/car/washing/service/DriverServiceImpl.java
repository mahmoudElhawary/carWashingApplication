package com.car.washing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.car.washing.model.Driver;
import com.car.washing.repository.DriverRepository;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverRepository DriverRepository ;
	
	@Override
	public List<Driver> findAll() {
		return (List<Driver>) DriverRepository.findAll();
	}

	@Override
	public Driver save(Driver driver) {
		return DriverRepository.save(driver);
	}

}
