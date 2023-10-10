package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import io.micrometer.common.util.StringUtils;
import net.javaguides.springboot.model.Student;
import net.javaguides.springboot.repository.StudentRepository;

@Service
public class StudentServices<Pageable> {

	@Autowired
	private StudentRepository studentRepository;

	// GetAll
	// public List<Student> findAllStudent(Pageable pageable ) {
	// List<Student> list = (List<Student>) this.studentRepository.findAll(pageable)
	// return list;
	// }

	// getAll
	// public Page<Student> getAllStudents(Pageable pageable) {
	// return studentRepository.findAll(pageable);
	// }

	// public List<Student> getAllStudent(int pageNumber,int pageSize){
	// int pageSize=10;
	// int pageNumber=0;
	// PageRequest p=PageRequest.of(pageNumber, pageSize);
	// Page<Student> page= this.studentRepository.findAll(p);
	// List<Student>allStudent=page.getContent();
	// return allStudent;
	// }

	// Add Student

	public Student addStudent(Student student) {
		return this.studentRepository.save(student);
	}

	// build get student by id
	public void getStudentById(long studentRoll) {
		this.studentRepository.findById(studentRoll);
	}

	// build update student
	public Student updateStudent(long studentRoll, Student studentdetail) {
		studentdetail.setStudentRoll(studentRoll);
		return this.studentRepository.save(studentdetail);

	}

	// build delete student
	public void deleteStudent(long studentRoll) {
		studentRepository.deleteById(studentRoll);
	}

	// Get All Data
	public List<Student> getAllStudent(int pageNumber, int pageSize) {
		PageRequest p = PageRequest.of(pageNumber, pageSize);
		Page<Student> page = this.studentRepository.findAll(p);
		List<Student> allStudent = page.getContent();
		return allStudent;
	}

}
