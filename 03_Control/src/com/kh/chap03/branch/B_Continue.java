package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue; : 반복문 안에서 사용하는 구문
	 *             continue를 만나게 되면 그 뒤에 어떤 코드가 있든간에 실행하지 않고 
	 *             가장 가까운 반복문으로 올라감.
	 */
	
	public void method1() {
		// 1부터 10까지 홀수만을 출력
		// 1 3 5 7 9
		
		//방법1
		for(int i = 1; i<10; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//방법2
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 1) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		//방법3
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 0) { // 짝수일경우
				continue;    // 아래 출력문을 무시하고 다시 증감식으로 넘어감.
			}
			System.out.print(i + " ");
		}
	}
	
	public void method2() {
		// 1부터 100까지의 총 합계
		// 단, 6의 배수값은 빼고 더해보기
		// 이때 continue문을 활용해서 코드 작성
		// 총 합계 : xx
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.printf("총합계 : %d", sum);
	}
	
	public void method3() {
		// 2단부터 9단까지 출력을 하되
		// 단, 4의 배수단은 빼고 출력하시오.(continue문 사용)
		
		for(int i = 2; i < 10; i++) {
			if(i % 4 == 0) {
				continue;
			}
			System.out.println("==== " + i + "단 ====");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j +" = "+ (i*j));
			}
		}
	}
	
	
	
	
	
	

}
