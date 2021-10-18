package com.account.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.entity.Account;
import com.account.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@PostMapping("/saveaccount")
	public Account saveAccount(@RequestBody Account account)
	{
		System.out.println("Saving Account");
		return accountService.saveAccount(account);
	}
	
	/*@GetMapping("getaccount/{accountnumber}")
	public List<Account> getAccountDetail(@PathVariable("accountnumber") String accountnumber)
	{
		System.out.println("Account Detail");
		return accountService.FindAccountByAccountNumber(accountnumber);
		
	}*/
	
	@GetMapping("/getaccount/{customerId}")
	public List<Account> getAccountCustomerDetail(@PathVariable("customerId") Integer customerId)
	{
		System.out.println("Account Detail By customer Id");
		List<Account> account= accountService.FindAccountByCustomerId(customerId);	
	    return account;
	}
}
