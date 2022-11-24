package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();

	public String calcArea(int x, int y, int width, int height) {
		r = new Rectangle(x, y, width, height);
		int calcArea = width * height;
		return "면적 : " + r.toString() + " / " + calcArea;
	}

	public String calcPerimeter(int x, int y, int width, int height) {
		r = new Rectangle(x, y, width, height);
		int calcPerimeter = 2 * (width + height);
		return "둘레 : " + r.toString() + " / " + calcPerimeter;
	}

}
