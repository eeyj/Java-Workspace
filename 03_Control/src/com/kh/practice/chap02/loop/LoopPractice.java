package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice1();
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice2();
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i);
			if (i != num) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = " + sum);
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		int i;
		if (num1 > 0 && num2 > 0) {
			if (num1 < num2) {
				for (i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}

			} else if (num1 > num2) {
				for (i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice4();
		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num <= 9) {
			for (; num <= 9; num++) {
				System.out.println("==== " + num + "단 ====");
				for (int i = 1; i <= 9; i++) {
					System.out.println(num + " X " + i + " = " + (num * i));
				}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			practice5();
			return;
		}
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("공차 : ");
		int num2 = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(num1 + " ");
			num1 += num2;
		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 0; j <= num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		/*
		 * for (int i = 1; i <= num; i++) { for (int j = num; j > 0; j--) { if (i < j) {
		 * System.out.print(" "); } else { System.out.print("*"); } }
		 * System.out.println(); }
		 */
		for (int i = 0; i < num; i++) { // 1 2 3 4 까지 반복
			for (int j = 1; j < num - i; j++) { // 1 2 3 까지 반복
				System.out.print(" ");
			}
			for (int j = 1; j < 2 + i; j++) { // 1 까지 반복
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); // 4 라고 가정

		for (int i = 0; i < num; i++) {// 0 1 2 3 바깥쪽 반복문 4행까지 실행 

			for (int j = 0; j < i; j++) {// 0 1 2 3 공란을 몇번 입력할지 
				                         // j 값이 i 와 동일하기 때문에 0 실행시 0개의 공란이 입력됨
				System.out.print(" ");
			}
			for (int j = 0; j < num - i; j++) {// 4 3 2 1 *을 몇번 입력할지
				                               // j 값은 num-1값이므로 0 1 2 3까지 *을 반복하여 입력
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		/*
		 * for (int i = 1; i <= num; i++) { ------------> 내가 푼것 for (int j = num; j - i
		 * > 0; j--) { System.out.print(" "); } for (int k = 1; k <= (2 * i) - 1; k++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		// 선생님 풀이
		for (int i = 0; i < num; i++) {
			// _ _ _* 공백 3개 출력 및 별 1개 출력
			for (int j = 0; j < num - (1 + i); j++) { // 공백 출력 부분은 1씩 감소하고 있음
				System.out.print(" ");
			}
			for (int j = 0; j < 1 + (2 * i); j++) { // * 출력 부분은 2씩 증가하고 있음
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * //_ _ _* 공백 3개 출력 및 별 1개 출력 for(int j = 0; j<3;j++) { // 공백 출력 부분은 1씩 감소하고 있음
		 * System.out.print(" "); } for(int j =0; j<1;j++) { // * 출력 부분은 2씩 증가하고 있음
		 * System.out.print("*"); } System.out.println();
		 * 
		 * // _ _ *** 공백 2개 및 별 3개 출력 for(int j = 0; j<2; j++) { System.out.print(" ");
		 * } for(int j = 0; j<3; j++) { System.out.print("*"); } System.out.println();
		 * 
		 * //_ ***** 공백 1개 및 별 5개 for(int j = 0;j<1;j++) { System.out.print(" "); }
		 * for(int j = 0;j<5;j++) { System.out.print("*"); } System.out.println();
		 */

	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if(num < 2) {
			System.out.println("잘못입력하셨습니다.");
			return;
		} 
		
		for(int i = 2; i < num; i++) {
			if(num%i == 0 && num !=2) {
				System.out.println("소수가 아닙니다.");
				return;
			}
		}
		System.out.println("소수입니다.");

	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		int result = 0;

		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		int count = 0;
		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;
			// i값이 소수인지 아닌지 검사를 함.
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
				count++;
			}
			// i값이 소수라면 출력을 하고, 값을 1증가시킴.
		}
		System.out.printf("\n2부터 %d까지의 소수의 개수는 %d개입니다. \n", num, count);
	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 2; i <= num; i++) {
			for (int j = 2; j < num; j++) {
				if (i % 2 == 0 || i % 3 == 0) {
					System.out.print(i + " ");
					break;
				}
			}
			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		System.out.println("\ncount : " + count);
	}

	public void practice16() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= (num * 2 - 1); i++) {
			int j = 1;
			if (i > num) {
				j += i - num;
			} else if (i < num) {
				j += num - i;
			}
			for (; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice17() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j != 1 && j != num) {
					if (i != num && i > 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void practice18() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			// _ _ *
			for (int j = 0; j < num - (1 + i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 1 + 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j < 1 + i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (num - i) - 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();

		for (int i = 1; i <= (num1 * 2 - 1); i++) {
			int j = 1;
			int k = 0;
			int l = 0;

			if (i > num1) {
				j += (i - (num1 - (num1 - 3))) * 2 - ((num1 - 3) * 2);
				k -= i - (num1 * 2);
			} else if (i < num1) {
				j -= (i - (num1 - (num1 - 3))) * 2 - ((num1 - 3) * 2);
				k += i;
			}
			l += j;
			for (; j <= (num1 * 2 - 1); j++) {
				for (; k < num1; k++) {
					if (i == num1) {
						break;
					}
					System.out.print(" ");
				}
				if (l == j) {
					System.out.print("*");
				} else if (j != num1 * 2 - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
