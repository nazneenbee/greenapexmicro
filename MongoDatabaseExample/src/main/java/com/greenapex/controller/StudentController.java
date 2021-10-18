package com.greenapex.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greenapex.entity.Student;
import com.greenapex.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("addstudent")
	public String addStudent() {
		return "student";
	}
	
	@PostMapping("savestudent")
	public String saveStudent(@ModelAttribute Student s)
	{
		studentService.saveStudent(s);
		return "success";
		
	}
	
	@GetMapping("getallstudent")
	public List<Student> findAllStudent()
	{
		return studentService.findAllData();
		
	}
	
	@PutMapping("updatestudent")
	public Student updateStudent(@RequestBody Student s)
	{
		try {
			return studentService.updateStudent(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
	}
	
	@GetMapping("findstudentbyid/{id}")
	public Optional<Student> FindStudenyById(@PathVariable("id") Integer id)
	{
		return studentService.FindStudentById(id);
		
	}
	
	@DeleteMapping("deletestudent")
	public List<Student> deleteStudent(@RequestParam("id") Integer id)
	{
		List<Student> s=studentService.deleteStudentById(id);
		return s;
	}
	
	@GetMapping("getstudentbyname/{name}")
	public List<Student> getStudenyByName(@PathVariable("name") String name)
	{
		return studentService.getStudentByName(name);
		
	}
	
	@GetMapping("getstudentnameaddressbyrollno/{rollNo}")
	public List<Student> getStudenyNameAddressByRollNo(@PathVariable("rollNo") Integer rollNo)
	{
		return studentService.getStuNameAndAddressByRollNo(rollNo);
		
	}

}
