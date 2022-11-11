package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		/*
		 * if (num == 1) { ->>>>>>>>>>>>>>>>>>>>>>>>내가 푼거
		 * System.out.println("입력 메뉴입니다."); } else if (num == 2) {
		 * System.out.println("수정 메뉴입니다."); } else if (num == 3) {
		 * System.out.println("조회 메뉴입니다."); } else if (num == 4) {
		 * System.out.println("삭제 메뉴입니다."); } else if (num == 7) {
		 * System.out.println("종료 메뉴입니다."); }
		 */

		String result = "";

		switch (num) {
		case 1:
			result = "입력";
			break;
		case 2:
			result = "수정";
			break;
		case 3:
			result = "조회";
			break;
		case 4:
			result = "삭제";
			break;
		case 7:
			result = "종료";
			break;
		}

		if (result.equals("종료")) {
			System.out.println("프로그램이 종료됩니다.");
		} else {
			System.out.println(result + " 메뉴입니다.");
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 한 개만 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 :");
		int kor = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();

		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		int sum = kor + math + eng;
		double avg = sum / 3;

		if (kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}

	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		String season = "";

		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
			return;
		}
		System.out.printf("%d월은 %s입니다.", month, season);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String id = sc.nextLine();

		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();

		if (id.equals("minmin")) {
			if (pw.equals("Min1234")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String rank = sc.nextLine();

		switch (rank) {
		case "관리자":
			System.out.print("회원관리, 게시글 관리, ");
		case "회원":
			System.out.print("게시글 작성, 댓글 작성, ");
		case "비회원":
			System.out.print("게시글 조회");
		}
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();

		double bmi = kg / (m * m);
		System.out.println("BMI 지수 : " + bmi);

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else if (bmi >= 30) {
			System.out.println("고도 비만");
		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();

		sc.nextLine();

		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);

		double result = 0;

		if (num1 > 0 && num2 > 0) {
			switch (op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = (double) num1 * num2;
				break;
			case '/':
				result = (double) num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
			System.out.printf("%d %s %d = %.6f", num1, op, num2, result);
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		int midle = sc.nextInt();

		System.out.print("기말 고사 점수 : ");
		int finals = sc.nextInt();

		System.out.print("과제 점수 : ");
		int task = sc.nextInt();

		System.out.print("출석 회수 : ");
		int attend = sc.nextInt();

		System.out.println("=============결과=============");

		double total = (midle * 0.2) + (finals * 0.3) + (task * 0.3) + attend;

		if (attend <= 14) {
			System.out.println("Fail [출석 회수 부족 (" + attend + "/" + "20)");
		} else {
			System.out.println("중간 고사 점수(20) : " + (midle * 0.2));
			System.out.println("기말 고사 점수(30) : " + (finals * 0.3));
			System.out.println("과제 점수    (30) : " + (task * 0.3));
			System.out.println("출석 점수    (20) : " + attend);
			System.out.println("총점 : " + (double) total);
			if (total < 70) {
				System.out.println("Fail");
			} else {
				System.out.println("Pass");
				return;
			}
		}
	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");

		System.out.print("선택 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;

		}

	}

	public void practice11() {

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.print("비밀번호 입력(1000~9999) : ");
		 * ----------------------------------------------> 내가 푼것 int pw = sc.nextInt();
		 * 
		 * String pws = pw + "";
		 * 
		 * if (999 < pw && pw < 9999) { char pw1 = pws.charAt(0); char pw2 =
		 * pws.charAt(1); char pw3 = pws.charAt(2); char pw4 = pws.charAt(3); if ((pw1
		 * == pw2) || (pw2 == pw3) || (pw3 == pw4) || (pw1 == pw3) || (pw2 == pw4) ||
		 * (pw1 == pw4)) { System.out.println("중복 값 있음"); } else
		 * System.out.println("성공"); } else System.out.println("자릿수 안맞음");
		 */

		System.out.print("비밀번호 입력(1000~9999) : ");
		int pwd = sc.nextInt();

		if (pwd > 999 && pwd < 9999) { // 자릿수 체크
			int first = pwd % 10; // ex) 9876/10 몫 : 987 나머지 : 6 ----> 일의 자릿수를 구할 수 있음
			int second = (pwd / 10) % 10; // ex) (9876/10) /10 몫 : 98 나머지 : 7 -------> 십의 자릿수를 구할 수 있음
			int third = (pwd / 100) % 10;
			int forth = (pwd / 1000) % 10;
			// 중복값이 있는지 처리하기
			if (first != second && first != third && first != forth && second != third && second != forth
					&& third != forth) {
				System.out.println("성공");
			} else {
				System.out.println("중복 값 있음");
			}

		} else {
			System.out.println("자릿수 안맞음");
		}

	}
}
