package com.registeredcustomer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.registeredcustomer.entity.Registration;
import com.registeredcustomer.service.IRegUserService;




@RestController
@RequestMapping("/reguser")
public class RegUserController {
	@Autowired
	IRegUserService regUserService;
	
	@PostMapping("/savereguser")
	public void saveRegisterdUser(@RequestBody Registration reg)
	{
		regUserService.saveRegisterUser(reg);
	}
	
	@GetMapping("/getreguser/{customerId}")
	public List<Registration> findRegUser(@PathVariable("customerId") Integer customerId)
	{
		return regUserService.findRegisteredUserByCustomerId(customerId);
		
	}
}
