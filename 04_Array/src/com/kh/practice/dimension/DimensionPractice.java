package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {

		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] arr = new int[4][4];

		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {
		int[][] arr = new int[4][4];

		int value = arr.length * arr[0].length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] arr = new int[4][4]; // 4행 4열 짜리 2차원 배열 생성

		/*
		 * int sum = 0; ---------------------------------------->>>> 내가 푼것 for (int i =
		 * 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length; j++) { int a =
		 * (int) (Math.random() * 10 + 1); if (i != arr.length - 1 && j != arr[0].length
		 * - 1) { arr[i][j] = a; arr[i][arr[0].length - 1] += arr[i][j]; arr[arr.length
		 * - 1][j] += arr[i][j];
		 * 
		 * } else { sum += arr[i][j]; } arr[3][3] = sum; System.out.printf("%4d",
		 * arr[i][j]); } System.out.println(); }
		 */

		// 랜덤값 대입을 위한 반복문
		for (int i = 0; i < arr.length - 1; i++) { // 3행까지 반복(마지막 행 제외)
			for (int j = 0; j < arr[i].length - 1; j++) { // 3열까지 반복(마지막 열 제외)
				arr[i][j] = (int) (Math.random() * 10 + 1); // 1~10까지의 랜덤값을 각배열에 입력
				arr[i][3] += arr[i][j]; // i행 3열에는 반복되어 들어간 i행 값들의 합계가 들어감
				arr[3][j] += arr[i][j]; // 3행 j열에는 반복되어 들어간 j열 값들의 합계가 들어감

				arr[3][3] += arr[i][j] * 2;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();

		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		/*
		 * if (num1 < 0 || num1 > 10 && num2 < 0 || num2 > 10) { --------------->>> 내가
		 * 푼것 System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다."); practice5(); } else {
		 * char[][] arr = new char[num1][num2]; for (int i = 0; i < arr.length; i++) {
		 * for (int j = 0; j < arr[i].length; j++) { int c = (int) (Math.random() * 25 +
		 * 65); arr[i][j] = (char) c; System.out.print(arr[i][j] + " "); }
		 * System.out.println(); } }
		 */

		while (true) {
			System.out.print("행 크기 : ");
			int row = sc.nextInt();

			System.out.print("열 크기 : ");
			int col = sc.nextInt();

			if (!(row >= 1 && row <= 10 && col >= 1 && col <= 10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야합니다.");
				continue;
			}

			char[][] arr = new char[row][col];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (char) (int) (Math.random() * 25 + 65);
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			break;
		}

	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {   // 조건식 열기준으로 설정하는게 좋음 : i<strArr[0].length
			for (int j = 0; j < strArr[i].length; j++) {  // 조건식 행기준으로 설정하는게 좋음 : j<strArr.length
				System.out.print(strArr[j][i] + " ");
			}
		}

	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 : ");
		int size = sc.nextInt();

		char[][] arr = new char[size][];

		char value = 'a';

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 열 크기 : ");
			arr[i] = new char[sc.nextInt()];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value;
				value = (char) (value+1);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {
		String[] attend = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표",
				"홍하하" };

		String[][] first = new String[3][2];
		String[][] second = new String[3][2];

		int value = 0;

		System.out.println("== 1분단 ==");

		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < first[i].length; j++) {
				first[i][j] = attend[value++];
				System.out.print(first[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < second[i].length; j++) {
				second[i][j] = attend[value++];
				System.out.print(second[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] attend = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표",
				"홍하하" };

		String[][] first = new String[3][2];
		String[][] second = new String[3][2];

		int value = 0;

		System.out.println("== 1분단 ==");

		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < first[i].length; j++) {
				first[i][j] = attend[value++];
				System.out.print(first[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < second[i].length; j++) {
				second[i][j] = attend[value++];
				System.out.print(second[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("============================");

		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();

		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < first[i].length; j++) {
				if (name.equals(first[i][j]) || name.equals(second[i][j])) {
					System.out.printf("검색하신 %s 학생은 %d분단 ", name, name.equals(first[i][j]) ? 1 : 2);

					if (i == 0) {
						System.out.print("첫 번째 줄 ");
					} else if (i == 1) {
						System.out.print("두 번째 줄 ");
					} else {
						System.out.print("세 번째 줄 ");
					}

					if (j == 0) {
						System.out.print("왼쪽에 있습니다.");
					} else {
						System.out.print("오른쪽에 있습니다.");
					}
				}
			}
		}

	}

}
