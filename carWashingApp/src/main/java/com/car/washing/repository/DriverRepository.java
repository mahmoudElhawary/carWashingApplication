package com.car.washing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.car.washing.model.Driver;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Long> {

}
