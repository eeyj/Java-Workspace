package com.kh.hw.shape.model.vo;

public class Shape {

	private int type;
	private double height;
	private double width;
	private String color = "white";

	// 기본생성자
	public Shape() {

	}

	// 매개변수가 있는 생성
	public Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
	}

	
	// setter, getter 메서드 작성
	public void setType(int type) {
		this.type = type;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getType() {
		return type;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public String getColor() {
		return color;
	}

	
	// 높이 너비 색깔을 반환하는 메서드(어떤 정보를 문자열 형태로 저장해주는 메소드)
	public String information() {
		return height + " " + width + " " + color;
	}

}
