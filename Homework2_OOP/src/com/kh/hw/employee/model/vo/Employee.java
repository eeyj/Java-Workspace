package com.kh.hw.employee.model.vo;

public class Employee {
	
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
	
	//기본 생성자
	public Employee() {
		
	}
	
	//4개의 초기 값을 받는 생성자
	public Employee(int empNo, String name, char gender, String phone) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	
	// 7개의 초기 값을 받는 생성자
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		this(empNo, name, gender, phone);
		this.dept = dept;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	// setter, getter 메소드
	public void setEmpNo(int empNO) {
		this.empNo = empNo;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getDept() {
		return dept;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public String printEmployee() {
		return  empNo + " "  + name + " " + gender + " " + phone + " " + dept + " " + salary + " " + bonus;
		
	}
	 
	
	
	
	
}
