package com.kh.cahp01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 기본적으로 프로그램의 진행은 순차적으로 진행됨. 단, 이 순차적인 흐름을 바꾸고자 한다면 제어문을 이용해서 직접 제어가 가능.
	 * 
	 * 선택적으로 실행시키고자 할때 => 제어문 반복적으로 실행시키고자 할때 => 반복문 그 외에는 => 분기문
	 * 
	 * 조건문 조건식을 통해 결과값이 참이나 거짓이냐를 판단해서 그에 해당하는 코드를 실행
	 * 
	 * 조건식 반드시 결과는 true/false여야함. 보통의 조건식에는 비교연산자, 논리연산자를 주로 사용한다.
	 * 
	 * 조건문은 크게 if문(단독, if~else, if ~else if,중복 if), switch문으로 나뉨
	 * 
	 */
	// 삼항연산자를 조건문으로 바꿔보기.
	public void method1() {
		/*
		 * 단독 if문
		 * 
		 * [표현법] if(조건식) { 조건식이 true인 경우 실행할 코드 } => 조건식의 결과가 참일경우 중괄호 블럭안에 코드가 실행된다. =>
		 * 조건식의 결과가 거짓일 경우 중괄호 안에 코드가 무시되고 넘어감.
		 */

		// 사용자에게 정수값을 입력받은 후 "양수다" / "양수가 아니다" 를 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();

		// num > 0 ? "양수입니다." : "음수입니다.";

		if (num > 0) {
			System.out.println("양수입니다."); // 양수입니다. 출력 먼저 적고 if 블럭으로 감싼다.
		}

		if (num <= 0) {
			System.out.println("양수가 아닙니다.");
		}

	}

	public void method2() {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		/*
		 * if~else 문 if(조건식) { ..조건식이 true일 경우 실행될 코드 } else { ..조건식이 false일 경우 실행될 코드 }
		 * 
		 */

		if (num > 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("양수가아닙니다.");
		}

	}

	public void method3() {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();

		/*
		 * if~else if문
		 * 
		 * 같은 비교대상으로 여러개의 조건을 제시해야할 경우 if(조건식1) { ..조건식1이 true일 경우 실행시킬 코드 작성.. } else
		 * if { ..조건식2이 true일 경우 실행시킬 코드 작성.. } else if { ..조건식3이 true일 경우 실행시킬 코드 작성..
		 * } [else { 모든 조건식의 결과가 false일 경우 실행시킬 코드 }] -> 생략가능
		 */

		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num == 0) {
			System.out.println("0입니다.");
		} else /* if(num < 0) */ {
			System.out.println("음수입니다.");
		}

	}

	public void method4() {
		// 사용자가 입력한 나이값을 가지고 어린이/청소년/성인 출력
		// if else if 문을 통해 만들어보기
		// 어린이 (13세이하) 청소년(13~19이하) 그외 성인

		Scanner sc = new Scanner(System.in);

		System.out.println("나이 : ");
		int age = sc.nextInt();

		if (age <= 13) {
			System.out.println("어린이");
		} else if (age <= 19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}

		// 다른방법으로 풀어보기 -> 어린이, 청소년,성인에 대한 값을
		// 담아두고 마지막에 출력문으로 출력해보기

		String result;

		if (age <= 13) {

			result = "어린이";

		} else if (age <= 19) {

			result = "청소년";

		} else {

			result = "성인";
		}

		System.out.println(result);

	}

	public void method5() {

		Scanner sc = new Scanner(System.in);
		// 사용자에게 이름과 성별을 입력받아 남자인지 여자인지 출력

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);

		String result = "";

		if (gender == 'm' || gender == 'M') {

			result = "남학생";
		} else if (gender == 'f' || gender == 'F') {

			result = "여학생";
		} else {

			System.out.println("잘못입력하셨습니다.");
			// 만약에 이 아래 코드를 실행시키고 싶지 않다면?
			// return이라는 녀석을 사용
			return; // 해당 일반메서드를 빠져나감(메소드를 호출했던 곳으로 돌아감)
		}

		System.out.printf("%s님은 %s이다.", name, result);
		// ->실행시 오류가 발생 String result =""; (초기화) 해주는게 필수

	}

	public void method6() {
		// 특이케이스, 문자열간의 동등비교 (문자열 == 문자열)
		// 사용자에게 이름을 입력받아 민경민이라는 문자열과 일치하는지 비교해보기.

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		// String 참조자료형
		if (name == "민경민") {

			System.out.println("민경민님 반갑습니다.");
		} else {
			System.out.println("민경민님이 아니신가보네요 ? ");
		}

		/*
		 * 기본자료형 : boolean, byte, short, int, long, float, double, char 참조자료형 : String
		 * // 특이한 케이스
		 * 
		 * 기본자료형간 비교시 == / !== 사용가능하지만, 참조자료형은 동등비교연산시 정상적으로 연산이안됨 그럼 어떻게 하나?
		 * 문자열.equals()라는 방법으로 비교함.
		 * 
		 */

		if (name.equals("민경민")) {// 즉 반환값이 true/false로 리턴해줌
			System.out.println("민경민님 반갑습니다.");
		} else {
			System.out.println("민경민님이 아니신가보네요 ? ");
		}

	}

	public void method7() {
		Scanner sc = new Scanner(System.in);
		// 양수를 입력받고, 짝수, 홀수인지 판별하는 프로그램

		System.out.print("정수(양수)를 입력 : ");
		int num = sc.nextInt();

		if (num > 0) {// 양수인지 확인

			if (num % 2 == 0) {// 양수이고 짝수일 경우
				System.out.println("짝수입니다.");
			} else { // 양수이고 홀수인 경우
				System.out.println("홀수입니다.");
			}

		} else {
			System.out.println("양수가 아닙니다. 잘못입력하셨습니다.");
			method7();
		}

	}

}
