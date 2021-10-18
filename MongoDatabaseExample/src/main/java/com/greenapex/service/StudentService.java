package com.greenapex.service;

import java.util.List;
import java.util.Optional;

import com.greenapex.entity.Student;

public interface StudentService {
public Student saveStudent(Student s);
public List<Student> findAllData();
public Student updateStudent(Student s) throws Exception;
public Optional<Student> FindStudentById(Integer id);
public List<Student> deleteStudentById(Integer id);
public List<Student> getStudentByName(String name);
List<Student> getStuNameAndAddressByRollNo(Integer rollNo);
}
