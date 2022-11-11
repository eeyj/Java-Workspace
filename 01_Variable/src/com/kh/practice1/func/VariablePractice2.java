package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void test2() {
		
		//키보드로 정수 두 개를 입력 받아 두 수의 
		//합, 차, 곱, 나누기한 몫을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : "+(num+num2)); //문자열 + 정수 의 경우 문자열 결합으로 인식 ex) 문자 + 23 + 7 = 문자237 / 문자 + (23 + 7) = 문자30(가로 연산자 기입하여 정수 덧셈이 우선되도록해야한다.)
		System.out.println("빼기 결과 : "+(num-num2));
		System.out.println("곱하기 결과 : "+(num*num2));
		System.out.println("나누기 결과 : "+(num/num2));
	}
}
