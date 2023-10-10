package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.Student;
import net.javaguides.springboot.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("StudentManagementAppStartig.....");
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		//Student student = new Student();
		/*
		 * student.setStudentRoll(0173); student.setStudentFirstName("Shlok");
		 * student.setStudentLastName("Kumar"); student.setStudentCity("Siwan");
		 * student.setStudentEmail("Shlokit017@gmail.com");
		 * this.studentRepository.save(student);
		 * 
		 * 
		 * Student student2=new Student(); student2.setStudentRoll(190);
		 * student.setStudentFirstName("Ajits"); student2.setStudentLastName("Mishra");
		 * student2.setStudentCity("Bhopal");
		 * student2.setStudentEmail("Ajit@123gmail.com");
		 * this.studentRepository.save(student2);
		 * 
		 * System.out.println("End Project");
		 * 
		 */
		//Student student2 = new Student();
		//System.out.println(student2);
	}

}
