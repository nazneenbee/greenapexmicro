package com.registeredcustomer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registeredcustomer.entity.Registration;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface IRegisteredCustomerRepository extends JpaRepository<Registration, Integer>{
	/*@Query("select count(*) from Customer c where c.email=email")
	public Integer getEmail(String email);*/
	
	/*public Integer countByEmail(String email);
	
	public Integer countByContact(String contact);
	
	@Query("FROM Customer c where c.customerId= :customerId")
	   public Customer findCustomerByCustomerId(@Param("customerId") Integer customerId);
*/
	
	public List<Registration> findByCustomerId(Integer customerId);
}