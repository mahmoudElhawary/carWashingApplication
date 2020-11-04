package com.car.washing.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Driver implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8073266205575923756L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long driverId ;
	
	private String fullName;
	@Column(unique = true)
	private String email;
	private String phoneNumber;
	private String ipAddress;
    private String lang;
    private String lat;
	@OneToMany(mappedBy = "driver", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<DriverDetails> details;
	
	private boolean isWaiting ;
	private boolean isOnline ;
	
	public Long getDriverId() {
		return driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public List<DriverDetails> getDetails() {
		return details;
	}

	public void setDetails(List<DriverDetails> details) {
		this.details = details;
	}

	public boolean isWaiting() {
		return isWaiting;
	}

	public void setWaiting(boolean isWaiting) {
		this.isWaiting = isWaiting;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
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
