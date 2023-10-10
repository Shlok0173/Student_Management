package net.javaguides.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentRoll;

	@Column(name = "first_name")
	private String studentFirstName;

	@Column(name = "last_name")
	private String studentLastName;

	@Column(name = "Email")
	private String studentEmail;

	@Column(name = "City")
	private String studentCity;

	public long getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(long studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public Student(long studentRoll, String studentFirstName, String studentLastName, String studentEmail,
			String studentCity) {
		super();
		this.studentRoll = studentRoll;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentEmail = studentEmail;
		this.studentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", studentEmail=" + studentEmail + ", studentCity=" + studentCity + "]";
	}

}
