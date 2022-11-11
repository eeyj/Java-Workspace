package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void test4() {
	
		//영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세개를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + name.charAt(0)); // String class 에 name 이라는 변수가 선언됨, name은 String이 가진 속성을 모두 사용할 수 있기때문에 name.charAt()을 사용할 수 있다.
		System.out.println("두 번째 문자 : " + name.charAt(1));
		System.out.println("세 번째 문자 : " + name.charAt(2));
	
	
	}
}
