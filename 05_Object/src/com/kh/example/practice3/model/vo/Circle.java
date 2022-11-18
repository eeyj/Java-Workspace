package com.kh.example.practice3.model.vo;

public class Circle {
	
	// 필드부
	private static final double PI = 3.14; // 상수 필드는 setter/getter 메서드가 필요 없음
	private int radius;
	
	//초기화블럭
	{
		radius = 1;
	}
	
	
	// 생성자부
	public Circle() {
		
		
	}
	
	// 메서드
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void incrementRadius() {
		radius++;
		getAreaOfCircle();
		getSizeOfCircle();
		
	}
	
	public void getAreaOfCircle() {
		System.out.println(2*PI*radius);
	}
	
	public void getSizeOfCircle() {
		System.out.println(radius*radius*PI);
	}
	
}
