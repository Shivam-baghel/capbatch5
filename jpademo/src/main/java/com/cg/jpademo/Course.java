package com.cg.jpademo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "course_tbl")
public class Course {
	
	@Id
	@Column(name="course_id")
	private int courseId;
	
	@Column(name="course_name", length = 20)
	private String courseName;
	
	private double fees;
	
	private int duration;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "course_student_tbl", 
	joinColumns = { @JoinColumn(name = "course_id") }, 
	inverseJoinColumns = { @JoinColumn(name = "student_id") })
	Set<Student> students = new HashSet<>();

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}	
	
	public void addStudent(Student student) {
		this.getStudents().add(student);
	}

}
