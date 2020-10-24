package com.car.washing.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Orders implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -355344200995976345L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ordersId ;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private User user;
	
	@OneToOne(targetEntity=OrderAdress.class,cascade=CascadeType.ALL) 
	private OrderAdress userAdresses;
	
	private String carType ;
	
}
