package com.car.washing.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long driverId ;
	
	@OneToOne(targetEntity=User.class) 
    private User user;
	
	@OneToMany(mappedBy = "driver", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<DriverDetails> details;
}
