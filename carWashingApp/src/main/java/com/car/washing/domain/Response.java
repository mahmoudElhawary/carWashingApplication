package com.car.washing.domain;

import java.io.Serializable;

public class Response implements Serializable{

	/**
	 * mahmoud saeed elhawary  
	 */
	private static final long serialVersionUID = -3396326666806451884L;
	private String message ;

	
	public Response(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
