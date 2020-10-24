package com.car.washing.service;

import java.util.List;

import com.car.washing.model.ContactUs;

public interface ContactUsService {

	List<ContactUs> findAll();

	ContactUs save(ContactUs contactUs);

}
