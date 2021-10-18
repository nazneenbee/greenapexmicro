package com.registeredcustomer.service.serviceimple;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.registeredcustomer.entity.Registration;
import com.registeredcustomer.repository.IRegisteredCustomerRepository;
import com.registeredcustomer.service.IRegUserService;


@Service
public class RegistrationServiceImpl implements IRegUserService{
	
   @Autowired
   IRegisteredCustomerRepository registerCustomerRepository;
   


@Override
public void saveRegisterUser(Registration regUser) {
	// TODO Auto-generated method stub
	registerCustomerRepository.save(regUser);
}



@Override
public List<Registration> findRegisteredUserByCustomerId(Integer customerId) {
	// TODO Auto-generated method stub
	return registerCustomerRepository.findByCustomerId(customerId);
}
	
	
}
