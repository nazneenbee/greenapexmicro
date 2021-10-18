package com.greenapex.service.imple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.greenapex.entity.Student;
import com.greenapex.repository.StudentRepository;
import com.greenapex.service.StudentService;


@Service
public class StudentServiceImple implements StudentService{
	@Autowired
   StudentRepository studentRepository;	

	@Override
	public Student saveStudent(Student s) {
		return studentRepository.save(s);
	}

	@Override
	public List<Student> findAllData() {
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student s) throws Exception{
		// TODO Auto-generated method stub
		java.util.Optional<Student> s1=studentRepository.findById(s.getRollNo());
		if(s1.isPresent())
		{
			Student stu=studentRepository.findById(s.getRollNo()).orElse(null);
			BeanUtils.copyProperties(s, stu);
			return studentRepository.save(stu);
		}
		else
		{
			throw new Exception("id not fount");
		}
	}

	@Override
	public Optional<Student> FindStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}

	@Override
	public List<Student> deleteStudentById(Integer id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return studentRepository.findAll();
	}

	@Override
	public List<Student> getStudentByName(String name) {
		// TODO Auto-generated method stub
		return studentRepository.findByName(name);
	}

	@Override
	public List<Student> getStuNameAndAddressByRollNo(Integer rollNo) {
		// TODO Auto-generated method stub
		return studentRepository.getStudentNameAndAddressByRollNo(rollNo);
	}

}
