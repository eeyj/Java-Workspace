package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	private Shape s = new Shape();

	public double calcPerimeter(double height, double width) {
		
		//모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화.
		s = new Shape(4, height, width);
		
		// 둘레를 반환
		return width * 2 + height * 2;
	}

	public double calcArea(double height, double width) {
		//모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화.
		s = new Shape(4, height, width);
		
		//넓이를 반환
		return width * height;
	}

	public void paintColor(String color) {
		
		//setter를 이용해 받아온 매개변수로 값을 변경
		s.setColor(color);

	}

	public String print() {
		
		//어떤모양인지 +information 합쳐서 값 반환
		return "사각형 " + s.information();
		
		
	}
}
