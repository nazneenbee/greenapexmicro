package com.account.service.serviceimple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.entity.Account;
import com.account.repository.AccountRepository;
import com.account.service.AccountService;

@Service
public class AccountServiceImple implements AccountService{

	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public Account saveAccount(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}

	@Override
	public List<Account> FindAccountByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return accountRepository.findByAccountNumber(accountNumber);
	}

	@Override
	public List<Account> FindAccountByCustomerId(Integer customerId) {
		// TODO Auto-generated method stub
		return accountRepository.findByCustomerId(customerId);
	}

}
