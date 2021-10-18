package com.customer.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.entity.Account;
import com.customer.entity.Customer;
import com.customer.service.ICustomerService;



@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	ICustomerService customerService;
	
	 @Autowired
	  private RestTemplate restTemplate;
	
	@PostMapping("/savecustomer")
	public void saveCustomer(@RequestBody Customer customer)
	{
		System.out.println("Saving Customer");
		customerService.saveCustomer(customer);
	}
	
	@GetMapping("/getcustomer/{customerId}")
	public Optional<Customer> getCustomer(@PathVariable("customerId") Integer customerId)
	{
		Optional<Customer> customer=customerService.getCustomerByCustomerId(customerId);
		List<Account> account=this.restTemplate.getForObject("http://account-service:9090/account/getaccount/" + customer.get().getCustomerId() , List.class);
		
		System.out.println(account);
		customer.get().setAccountInfo(account);
        return customer;
	}
	
	@GetMapping("/getcustomerreg/{customerId}")
	public Optional<Customer> getCustomerReg(@PathVariable("customerId") Integer customerId)
	{
		Optional<Customer> customer=customerService.getCustomerByCustomerId(customerId);
		List<com.customer.entity.Registration> reguser=this.restTemplate.getForObject("http://reguser-service:9092/reguser/getreguser/" + customer.get().getCustomerId() , List.class);
		
		System.out.println(reguser);
		customer.get().setRegInfo(reguser);
        return customer;
	}
}
