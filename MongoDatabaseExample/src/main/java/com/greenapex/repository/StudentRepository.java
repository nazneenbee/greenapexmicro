package com.greenapex.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.greenapex.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer>{
	/*@Query("{name : ?0}")                                         // SQL Equivalent : SELECT * FROM BOOK where author = ?
    List<Student> getStudent(String name);*/
	
	
	@Query(value= "{rollNo: ?0}", fields="{name:1, address:1, rollNo:0}")   // only data of name & author properties will be displayed
    //@Query(value= "{pages: ?0}", fields="{name:1, author:1, cost:1, pages:1}") // will display all properties data
    List<Student> getStudentNameAndAddressByRollNo(Integer rollNo);
	
	List<Student> findByName(String name);
}
