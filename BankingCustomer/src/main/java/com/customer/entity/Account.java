package com.customer.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Account {
	
	Integer accountId;
	
	String accountNumber;
	
	Double balance;
	
	String ifscCode;
	
	String branchName;
	
	String branchCode;
	
	Integer customerId;
	
}
