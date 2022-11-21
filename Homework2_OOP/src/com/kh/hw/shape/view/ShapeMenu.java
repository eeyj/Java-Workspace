package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.*;

public class ShapeMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private SquareController scr = new SquareController();
	
	private TriangleController tc = new TriangleController();
	
	
	public void inputMenu() {
		System.out.println("==== 도형 프로그램 ====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int type = sc.nextInt();
		
		switch(type) {
		case 3 : triangleMenu(); break;
		case 4 : squareMenu();break;
		case 9 : System.out.println("프로그램을 종료합니다.");break;
		default : System.out.println("잘못된 번호입니다. 다시 입력하세요.");
		          inputMenu();
		}
		
	}
	
	public void triangleMenu() {
		System.out.println("==== 삼각형 ====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴번호 : ");
		int menuNum = sc.nextInt();
		sc.nextLine();
	    inputSize(3, menuNum);
		
	}
	
	public void squareMenu() {
		
		System.out.println("==== 사각형 ====");
		System.out.println("1. 사각형 면적");
		System.out.println("2. 사각형 색칠");
		System.out.println("3. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴번호 : ");
		int menuNum = sc.nextInt();
		
		sc.nextLine();
		inputSize(4, menuNum);
		
	}
	
	public void inputSize(int type, int menuNum) {
		
		
		if(menuNum == 1) {
			System.out.print("높이 : ");
			double height = sc.nextDouble();
			
			System.out.print("넓이 : ");
			double width = sc.nextDouble();
			
			System.out.println(tc.calcArea(height, width));
			triangleMenu();
			
		} else if(menuNum == 2) {
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.nextLine();
			
			System.out.println("색이 수정되었습니다.");
			
			
			triangleMenu();
			
		} else if(menuNum == 3) {
			System.out.println(tc.print());
			triangleMenu();
			
		} else if(menuNum== 9) {
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
		}
		
	}
	
	public void printinformation(int type) {
		
	}
	

}
