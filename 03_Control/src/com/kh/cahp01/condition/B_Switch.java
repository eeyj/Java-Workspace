package com.kh.cahp01.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 * switch문 if문 둘은 동일한 조건문
	 * 
	 *  차이점
	 *  if(조건식) => 조건식을 복잡하게 기술가능, 범위 제시 가능
	 *  switch 조건식 => 정확한 값의 조건만 기술(동등비교만 수령)
	 *  
	 *  [표현법]
	 *  switch(앞으로 동등비교를 할 대상자) {
	 *  case 값1 : 실행할 코드1; // 앞으로 동등비교를 할 대상자 == 값1 일 경우 실행할 코드 
	 *  	      break; //실행할 코드1만 실행하고 switch문을 빠져나갈지 결정하는 키워드
	 *  
	 *  //브레이크문이 없다면 이 아래 코드로 계속 실행됨
	 *  case 값2 : 실행할 코드1;
	 *           break;
	 *     
	 *           
	 *  case 값n : 실행할코드n;
	 *             break;
	 *  
	 *  ...
	 *  default : 실행할 코드 // if~else문에서 else와 같은 역할을 함.
	 *                     // 위의 값1,값2,...값n까지 앞으로 동등비교를 할 대상과 하나도 일치하지 않다면
	 *                     // default내의 실행할 코드가 실행됨
	 *  }
	 * 
	 * switch문 자주 사용되진 않지만, 사용하는 경우에는 정말 정밀하게 동일한 연산결과가 수행되어야하는 경우
	 * ex) 키보드 입력, 마우스 입력 등.
	 * 
	 * 
	 */
	
	public void method1() {
		//1~3사이의 정수값을 입력받아서 
		//1인 경우 "빨간불입니다."
		//2인 경우 "파란불입니다."
		//3인 경우 "초록불입니다."
		//그외 "잘못입력했습니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
//		if(num == 1) {
//			System.out.println("빨간불입니다.");
//		} else if (num == 2) {
//			System.out.println("파란불입니다.");
//		} else if (num == 3) {
//			System.out.println("초록불입니다.");
//		} else {
//			System.out.println("잘못입력했습니다.");
//		}
		
		
		switch (num) {
		case 1 : 
			System.out.println("빨간불입니다."); 
			break;
		case 2 :
			System.out.println("파란불입니다.");
			break;
		case 3 :
			System.out.println("초록불입니다.");
			break;
		default :
			System.out.println("잘못입력했습니다.");
		
		}
	}

	public void method2() {
		// 사용자에게 구매할 과일명(사과, 바나나, 복숭아)을 입력받아
		// 각 과일마다 가격을 출력할 것(사과 1000원, 바나나 2000원, 복숭아 5000원)
		// 잘못된 과일입력시 저희 가게에서 판매하는 과일이 아닙니다.
		
		// 과일 xxx의 가격은 xxx원입니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 과일(사과, 바나나, 복숭아) 입력 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "사과" : 
			price = 1000;
			break;
			
		case "바나나" :
			price = 2000;
			break;
			
		case "복숭아" :
			price = 5000;
			break;
		
		default :
			System.out.println("저희 가게에서 판매하는 과일이 아닙니다.");
			method2();
			return;
		}
		
		System.out.printf("과일 %s의 가격은 %d원입니다.", fruit, price);
	}

	
	public void method3() {
		// 사용자에게 등급별로 권한을 부여하는 프로그램
		// 1 : 관리권한,글쓰기권한, 읽기권한
		// 2 : 글쓰기권한, 읽기권한
		// 3 : 읽기권한
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급 : ");
		int rank = sc.nextInt();
		
		switch(rank) {
		case 1 : 
			System.out.print("관리권한, ");
		case 2 :
			System.out.print("글쓰기권한, ");
		case 3 :
			System.out.print("읽기권한");
			break;
		}
		
	}
	
	public void method4() {
		//사용자에게 1월~12월 사이의 월을 입력받아 해당 달에 마지막 날짜를 출력하는 프로그램.
		// 1,3,5,7,8,10,12 = 31 / 4,6,9,11 = 30 /2 = 28 or 29
		
		//"해당 달은 31(30)일까지 입니다."
		//"해당 달은 28일 또는 29일까지 입니다."
		//"반드시 1월~12월까지 입력해야합니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월 ~ 12월 사이의 월 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : 
		case 3 : 
		case 5 : 
		case 7 : 
		case 8 : 
		case 10 : 
		case 12 : System.out.println("해당 달은 31일까지입니다."); break;
		case 4 : 
		case 6 : 
		case 9 : 
		case 11 : System.out.println("해당 달은 30일까지입니다."); break;
		case 2 : System.out.println("해당 달은 28일 또는 29일까지입니다."); break;
		default : System.out.println("반드시 1월 ~ 12월까지 입력해야합니다."); 
		
		}
		
	}
	
	
}
