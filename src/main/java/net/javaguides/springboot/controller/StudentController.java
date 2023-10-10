package net.javaguides.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Student;
import net.javaguides.springboot.service.StudentServices;

@CrossOrigin("*")
@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentServices studentService;

//	@GetMapping
	/*
	 * public ResponseEntity<List<Student>> findAllStudent() { List<Student> list =
	 * (List<Student>) this.studentService.findAllStudent(); if (list.size() <= 0) {
	 * return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); } return
	 * ResponseEntity.of(Optional.of(list)); }
	 */

	// @GetMapping
	// public ResponseEntity<Page<Student>> getAllStudents(
	// @RequestParam(defaultValue = "0") int page,
	// @RequestParam(defaultValue = "10") int size) {
	// Pageable pageable = PageRequest.of(page, size);
	// Page<Student> students = studentService.getAllStudents(pageable);
	// return ResponseEntity.ok(students);
	/// }

	    @GetMapping
	   public ResponseEntity<List<Student>> getStudent(
	  	@RequestParam(value = "pageNumber", defaultValue = "0") int pageNumber,
			@RequestParam(value = "pageSize", defaultValue = "3") int pageSize) {
		List<Student> student = this.studentService.getAllStudent(pageNumber, pageSize);
		return new ResponseEntity<List<Student>>(student, HttpStatus.OK);
	}
	
	//@GetMapping
	//public ResponseEntity<Page<Student>> getStudent(
	//	@RequestParam(value ="pageNumber",defaultValue ="0") int PageNumber,
	//	@RequestParam(value ="pageSize",defaultValue = "5")int pageSize){
	//	Page<Student> student=(Page<Student>)this.studentService.getAllStudent(PageNumber, pageSize);
	//	return ResponseEntity.ok(student);
	//}
	
	//  Page<User> users = userService.getUsersWithPagination(page, size, sortField, sortOrder, search);
    //  return ResponseEntity.ok(users);

	// build create student REST API
	@PostMapping
	@ResponseBody
	public Student createStudent(@RequestBody Student student) {
		return this.studentService.addStudent(student);

	}

	@GetMapping("{studentRoll}")
	public void getByStudentId(@PathVariable("studentRoll") long studentRol) {
		this.studentService.getStudentById(studentRol);
	}

	// build update student REST API
	@PutMapping("{studentRoll}")
	@ResponseBody
	public void upStudent(Student student, @PathVariable("studentRoll") long studentRoll) {
		this.studentService.updateStudent(studentRoll, student);

	}

	@DeleteMapping("{studentRoll}")
	public void deleteStudent(@PathVariable long studentRoll) {
		studentService.deleteStudent(studentRoll);
	}
}