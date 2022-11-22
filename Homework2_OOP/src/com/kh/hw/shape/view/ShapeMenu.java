package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.*;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	// 삼각형과 사각형을 선택하게 하는 메소드
	public void inputMenu() {
		while (true) { // 무한반복문을 활용하여 도형프로그램 선택 메뉴가 계속하여 반복되도록 설정
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");

			System.out.print("메뉴 번호 : ");
			int type = sc.nextInt();

			switch (type) {
			case 3:
				triangleMenu();
				break;
			case 4:
				squareMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return; // 해당 메서드를 빠져나갈 수 있도록. return문을 작성.
			// System.out.println("프로그램을 종료합니다.");
			// break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력하세요."); // inputMenu(); -- 무한반복문을 활용하면 inputMenu()메소드를 재실행시킬 필요 없음
			}
		}

	}

	public void triangleMenu() {
		while (true) {
			System.out.println("==== 삼각형 ====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				inputSize(3, 1);
				break;
			case 2:
				inputSize(3, 2);
				break;
			case 3:
				printInformation(3);
				break;
			case 9:
				return;
			default:
			}
		}
	}

	public void squareMenu() {
		while (true) {
			System.out.println("==== 사각형 ====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				inputSize(4, 1);
				break;
			case 2:
				inputSize(4, 2);
				break;
			case 3:
				inputSize(4, 3);
				break;
			case 4:
				printInformation(4);
				break;
			case 9:
				return;
			default:
			}
		}

	}

	public void inputSize(int type, int menuNum) {

		if (type == 3) {
			if (menuNum == 1) { // 삼각형의 면적 메뉴 선택시
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();

				System.out.print("삼각형의 면적 : ");
				System.out.println(tc.calcArea(height, width)/2);

			} else {
				sc.nextLine();
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}

		} else {
			if (menuNum == 3) {
				sc.nextLine();
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");

			} else {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				if (menuNum == 1) {
					System.out.print("사각형의 둘레 : ");
					System.out.println(scr.calcPerimeter(height, width));
				} else {
					System.out.print("사각형의 면적 : ");
					System.out.println(scr.calcArea(height, width));
				}
			}

		}
	}

	public void printInformation(int type) {
		if (type == 3) {
			System.out.println(tc.print());

		} else if (type == 4) {
			System.out.println(scr.print());
		}

	}

}
