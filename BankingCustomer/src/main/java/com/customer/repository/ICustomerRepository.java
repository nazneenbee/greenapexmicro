package com.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.entity.Customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer>{
	/*@Query("select count(*) from Customer c where c.email=email")
	public Integer getEmail(String email);*/
	
	/*public Integer countByEmail(String email);
	
	public Integer countByContact(String contact);
	
	@Query("FROM Customer c where c.customerId= :customerId")
	   public Customer findCustomerByCustomerId(@Param("customerId") Integer customerId);
*/
}