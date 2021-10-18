package com.greenapex.entity;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;

@Data
@Document("student")
public class Student {
	@Id
	Integer rollNo;
	
	@NotBlank(message="enter name")
	String name;
	String email;
	String contact;
	String address;
}
