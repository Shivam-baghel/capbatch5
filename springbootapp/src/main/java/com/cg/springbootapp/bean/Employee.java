package com.cg.springbootapp.bean;

public class Employee {
	
	private int empNo;
	private String name;
	private double balance;
	public Employee(int empNo, String name, double balance) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.balance = balance;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
