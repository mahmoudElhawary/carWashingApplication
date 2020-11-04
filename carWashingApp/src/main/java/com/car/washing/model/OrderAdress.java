package com.car.washing.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class OrderAdress implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8610975649613041304L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userAdressId ;
    private String address;
    private String lang;
    private String lat;
    
    @OneToOne(targetEntity=Orders.class) 
    private Orders orders ;
    
	public Long getUserAdressId() {
		return userAdressId;
	}
	public void setUserAdressId(Long userAdressId) {
		this.userAdressId = userAdressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
    
	
}
