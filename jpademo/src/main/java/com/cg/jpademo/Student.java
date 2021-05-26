package com.cg.jpademo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_tbl")
public class Student {

	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_name",length = 20)
	private String studentName;
	
	@Column(name="email",length = 20)
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy="students")
	Set<Course> courses = new HashSet<>();	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addr_id")
	private Address mailingAddress;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}	
	
	public Address getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(Address mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	
}
