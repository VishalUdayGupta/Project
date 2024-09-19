package net.java.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.java.sms.entity.Student;
import net.java.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Student student1 = new Student((long) 31, "Vishal", "Gupta", "vishal@gmail.com");
		studentRepository.save(student1);
		
		
		Student student2 = new Student((long) 31, "Saurabh", "Chauhan", "saurabh@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student((long) 41, "Shivam", "Dubey", "dubey@gmail.com");
		studentRepository.save(student3);
		
	}

}
