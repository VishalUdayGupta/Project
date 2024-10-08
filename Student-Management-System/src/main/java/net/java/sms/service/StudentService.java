package net.java.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.java.sms.entity.Student;



public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deletestudentById(Long id);

}
