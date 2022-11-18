package com.kh.example.practice4.model.vo;

public class Student {
	
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 1;
		classroom = 3;
		name = "이유진";
		height = 163.3;
		gender = '여';
	}
	
	public Student() {
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public void information() {
		System.out.println(grade + "학년, " +classroom +"반, "+name+"은 키 " + height +"cm, 성별 " + gender+"자 입니다.");
	}
	
	
	
	
	
	
}
