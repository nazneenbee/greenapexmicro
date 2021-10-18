package com.registeredcustomer.service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import com.registeredcustomer.entity.Registration;



public interface IRegUserService {
	public void saveRegisterUser(Registration regUser);
	
	//public Registration findUserByUserName(String userName);
	public List<Registration> findRegisteredUserByCustomerId(Integer customerId);
}
