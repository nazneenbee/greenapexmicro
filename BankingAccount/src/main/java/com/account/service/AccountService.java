package com.account.service;

import java.util.List;
import java.util.Optional;

import com.account.entity.Account;

public interface AccountService {
	
	public Account saveAccount(Account account);
	 
	//public Account FindAccountByCustomerId(Integer customerId);
	
	public List<Account> FindAccountByAccountNumber(String accountNumber);
	
	public List<Account> FindAccountByCustomerId(Integer customerId);

}
