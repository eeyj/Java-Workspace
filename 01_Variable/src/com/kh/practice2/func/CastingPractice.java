package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double d1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		double d2 = sc.nextDouble();
		
		System.out.print("수학 : ");
		double d3 = sc.nextDouble();

		System.out.printf("총점 : %d \n",(int) (d1+d2+d3));
		System.out.printf("평균 : %d \n",(int) ((d1+d2+d3)/3));
		
		// 다른 풀이 방법 (총점과 평균에 해당하는 변수를 먼저 선언 후 해당 변수를 출력하는 방식)
		// 변수 선언시 총점 부분에서 int 강제 타입변환을 하면 avg 변수 값은 자동으로 정수형으로 선언 가능함.
		// int sum = (int) (d1 + d2 + d3); => 총점에 해당하는 변수 선언
		// int avg = sum/3; => 평균에 해당하는 변수 선얹
		// System.out.printf("총점 : %d \n", sum);
		// System.out.printf("평균 : %d \n", avg);
		
	}

}
