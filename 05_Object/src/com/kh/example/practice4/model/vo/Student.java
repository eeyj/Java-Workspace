package com.kh.example.practice4.model.vo;

public class Student {

	// 필드선언부
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	// 초기화 블럭
	{
		grade = 1;
		classroom = 3;
		name = "이유진";
		height = 163.3;
		gender = '여';
	}

	// 생성자부 - 기본생성자
	public Student() {

	}

	// 메소드부
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

	public int getGrade() {
		return grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public char getGender() {
		return gender;
	}

	// 정보 출력 메서드
	public void information() {
		//xxx학생은 x학년 x반이고, 키는 xxx.xcm이며 남(여)학생입니다.
		System.out.printf("%s학생은 %d학년 %d반이고, 키는 %.1fcm이며 %c학생입니다.",name,grade,classroom,height,gender);
		//System.out.println(grade + "학년 " + classroom + "반, " + name + "은 키 " + height + "cm, 성별 " + gender + "자 입니다.");
	}

}