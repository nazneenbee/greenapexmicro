package com.customer.entity;


import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.Data;

@Entity
@Data
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer customerId;
	
	@Column(name="firstName")
	String firstName;
	
	@Column(name="lastName")
	String lastName;
	
	@Column(name="gender")
	String gender;
	
	@Column(name="email")
	String email;
	
	@Column(name="contact")
	String contact;
	
	@Column(name="dob")
	Date dob;
	
    @Column(name="adharNumber")
	long aadharNumber;
    
    @Column(name="panNumber")
	String panNumber;
    
    @Column(name="accountType")
    String accountType;
    
    @Transient
    List<Account> accountInfo;
    
    @Transient
    List<Registration> regInfo;
    @Transient
	Integer otp;
}
