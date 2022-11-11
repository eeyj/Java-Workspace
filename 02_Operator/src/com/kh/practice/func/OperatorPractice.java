package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();

		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();

		int result1 = num2 / num1;
		int result2 = num2 % num1;

		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + result2);
		
		//System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		//System.out.println("남는 사탕 개수 : " + (num2 % num1));

	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();

		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();

		sc.nextLine(); // nextxxx(); 이후 nextLine() 메소드 사용시 개행값(\n)이 지워지지 않기때문에 
		               // String index out of range : 0 오류가 발생한다
		               // 그러므로 nextLine() 실행전 한번더 sc.nextLine() 기입하여 개행값을 지워주어야한다.
		              
		
		System.out.print("성별(M/F) : ");
		//String gender = (sc.next().charAt(0) == 'M') ? "남학생" : "여학생"; -> 내가 푼거
		
		char gender = sc.nextLine().charAt(0); // -> 선생님이 푼거
		
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();

		//System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, group, num, name, gender, score); -> 내가 푼거
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, group, num, name, ((gender == 'M') ? "남학생" : "여학생"), score); // -> 선생님이 푼거
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();

		//String result = ((age <= 13) ? "어린이" : (age > 13 && age <= 19 ? "청소년" : "성인")); -> 내가 푼것
		//                                         첫번째 조건문에서 이미 13세 이하를 제외한 13세 초과 값들만 두번째 조건문으로 넘어오기 때문에
		//                                         age > 13 조건은 필요없는 조건식이다.
		String result = ((age <= 13) ? "어린이" : (age <= 19 ? "청소년" : "성인")); // -> 선생님이 푼것
		
		System.out.println(result);

	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int kor = sc.nextInt();

		System.out.print("영어 : ");
		int eng = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3;
		String print = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(print);
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String str = sc.nextLine(); 

		char gender = str.charAt(7);
		//String result = (gender == '1' || gender == '3') ? "남자" : (gender == '2' || gender == '4') ? "여자" : "잘못입력하셨습니다.";
		String result = (gender == '1' || gender == '3') ? "남자" : "여자";
		System.out.println(result);
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int num3 = sc.nextInt();

		boolean result = num3 <= num1 || num3 > num2;

		System.out.println(result);
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

		boolean result = num1 == num2 && num2 == num3;

		System.out.println(result);

	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();

		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();

		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();

		double a2 = a * 1.4;
		double b2 = b;
		double c2 = c * 1.15;

		System.out.printf("A사원의 연봉/연봉+a : %d/%.1f \n", a, a2);
		System.out.println(a2 >= 3000 ? "3000 이상" : "3000 미만");
		System.out.printf("B사원의 연봉/연봉+a : %d/%.1f \n", b, b2);
		System.out.println(b2 >= 3000 ? "3000 이상" : "3000 미만");
		System.out.printf("C사원의 연봉/연봉+a : %d/%.13f \n", c, c2);
		System.out.println(c2 >= 3000 ? "3000 이상" : "3000 미만");
	}

}
