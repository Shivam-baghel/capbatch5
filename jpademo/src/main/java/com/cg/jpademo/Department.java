package com.cg.jpademo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "department_tbl")
public class Department {
	
	@Id
	@Column(name="dept_id")
	private int deptId;
	
	@Column(name="dept_name", length = 50)
	private String deptName;
	
	@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Employee> employees = new HashSet<>();

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}	

}
