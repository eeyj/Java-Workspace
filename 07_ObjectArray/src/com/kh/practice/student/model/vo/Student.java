package com.kh.practice.student.model.vo;

public class Student {
	
	private String name;
	private String subject;
	private int score;
	
	public Student() {
		//super(); // 생성자 - 직접 작성하지 않아도 jvm이 자동으로 생성해줌
	}
	
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSubject(String subjet) {
		this.subject = subject;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public int getScore() {
		return score;
	}
	
	public String inform() {
		return "이름 : " + name + " / 과목 : " +subject + " / 점수 : "+score;
	}
	
	
	
	
	
}
