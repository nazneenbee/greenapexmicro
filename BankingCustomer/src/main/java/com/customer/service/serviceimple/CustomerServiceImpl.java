package com.customer.service.serviceimple;

import java.text.ParseException;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.customer.entity.Customer;
import com.customer.repository.ICustomerRepository;
import com.customer.service.ICustomerService;


@Service
public class CustomerServiceImpl implements ICustomerService{
	
   @Autowired
   ICustomerRepository customerRepository;
   

@Override
public void saveCustomer(Customer customer) {
	// TODO Auto-generated method stub
	customerRepository.save(customer);
	
}


@Override
public Optional<Customer> getCustomerByCustomerId(Integer customerId) {
	// TODO Auto-generated method stub
	return customerRepository.findById(customerId);
}
 	
}
