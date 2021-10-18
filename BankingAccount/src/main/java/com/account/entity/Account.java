package com.account.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer accountId;
	
	@Column(name="accountNumber")
	String accountNumber;
	
	@Column(name="balance")
	Double balance;
	
	@Column(name="ifscCode")
	String ifscCode;
	
	@Column(name="branchName")
	String branchName;
	
	@Column(name="branchCode")
	String branchCode;
	
	@Column(name="customerId")
	Integer customerId;
	
	/*@ManyToOne
	@JoinColumn(name ="customerId")
	private Customer customer;*/
	

	
	
}
