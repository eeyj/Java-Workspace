package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class C_DimensionalArray {
	// 이차원 배열 : 일차원 배열 여러개를 하나로 묶은것

	public void method1() {

		// 일차원 배열 선언
		int[] arr1;
		int arr2[];

		// 이차원 배열 선언
		int[][] arr3;
		int arr4[][];
		int[] arr5[];

		// 이차원 배열에 선언과 동시에 할당
		int[][] arr = new int[3][5]; // 3행, 5열의 이차원 배열

		System.out.println(arr);
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(arr[0][0]);

		System.out.println("행의 길이 : " + arr.length); // 3

		// 각 행별 열의 길이
		System.out.println("0번 열의 길이 : " + arr[0].length); // 5
		System.out.println("1번 열의 길이 : " + arr[1].length); // 5
		System.out.println("2번 열의 길이 : " + arr[2].length); // 5

		/*
		 * 출력(arr[0][0]) -> 1행 1열 출력(arr[0][1]) -> 1행 2열 .... 출력(arr[0][4]) -> 1행 5열
		 * ....... 출력(arr[2][4]) -> 3행 5열
		 *
		 * 
		 */

		/*
		 * 바깥쪽 for문 => 행에 대해 지정(0행 ~ 2행) == (0행 ~ 행의크기-1) == (0행 ~ arr.length-1) 안쪽 for문
		 * => 열에 대해 지정(0열 ~ 4열) == (0열 ~ 각 행별 열의 크기 -1) == (0열 ~ arr[행의 인덱스].length-1)
		 * 
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void method2() {
		// 순서대로 1,2,3,4 ... 15까지 값을 넣어보기
		int[][] arr = new int[3][5]; // arr[0][0] -> 1, arr[0][1] -> 2 arr[2][4] -> 15

		// 값을 대입, 출력
		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				// value++;
				// System.out.print(arr[i][j] + " ");
				System.out.printf("%-3d", arr[i][j]);

			}
			System.out.println();
		}
	}

	public void method3() {

		// 일차원 배열 선언 및 할당과 동시에 초기화
		int[] arr = { 1, 2, 3, 4, 5 };

		// 이차원 배열 선언 및 할당과 동시에 초기화
		int[][] arr2 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t"); // \t 들여쓰기(Tap)
			}
			System.out.println();
		}
	}

	public void method4() {
		/*
		 * 가변 배열 행의 크기는 정해져 있으나 각각의 행별로 열의 개수가 정해져 있지 않은 상태 이차원 배열 == 일차원 배열 여러개를 묶어놓은
		 * 형태 즉, 묶여있는 일차원 배열의 길이가 꼭 같을 필요는 없다.
		 * 
		 * 단, 행크기는 생략이 불가, 반드시 지정해야함. 열 크기는 생략이 가능하다. 각 행의 열의 길이가 변경 가능함.
		 * 
		 */

		int[][] arr = new int[3][]; // 가변 배열(행의 크기는 3행)

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr.length);
		// System.out.println(arr[0].length); // NullPointerException
		// System.out.println(arr[0][2]);// NullPointerException

		// 아직 각 행별로 열의 크기가 지정되지 않았음으로 Null값이 대입된 상태에서
		// 특정 인덱스로 접근하려 했기 때문에 NullPointerException이 발생했다.

		arr[0] = new int[2]; // 0 0
		arr[1] = new int[] { 5, 6, 8 };
		arr[2] = new int[4];
		/*
		 * 0 0 5 6 8 0 0 0 0
		 * 
		 */

		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

	public void method5() {
		// char[][] 가변 배열 생성
		char[][] arr = new char[3][];
		/*
		 * a b c d e f g h i j k
		 */
		arr[0] = new char[3];
		arr[1] = new char[2];
		arr[2] = new char[6];

		char value = 'a';

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value;
				value = (char) (value + 1);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void method6() {
		// 3행 3열짜리 String[][] 배열 생성 후
		// 중첩 반복문을 이용해 현재행, 현재열의 순번(인덱스) 출력
		// (0 , 0)(0 , 1)

		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d , %d)", i, j);
			}
			System.out.println();
		}

	}

	public void method7() {
		// int형 2차원 배열을 만들어서
		// 0번행 국어 점수 3개 입력받고
		// 1번행 영어 점수 3개 입력받고
		// 각각 반복문을 활용해서 출력
		// 입력 예시 : xx 점수를 입력하세요 :
		// 출력 예시 : xx 점수 : xx xx xx

		int[][] score = new int[2][3];

		Scanner sc = new Scanner(System.in);

		/*
		 * String kor = ""; String eng = ""; for (int i = 0; i < score.length; i++) {
		 * for (int j = 0; j < score[i].length; j++) { if (i == 0) {
		 * System.out.print("국어 점수를 입력하세요 : "); score[i][j] = sc.nextInt(); kor +=
		 * score[i][j] + " "; } else { System.out.print("영어 점수를 입력하세요 : "); score[i][j]
		 * = sc.nextInt(); eng += score[i][j] + " "; } }
		 * 
		 * } System.out.println("국어 점수 : " + kor); System.out.println("영어 점수 : " + eng);
		 */

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%s 점수를 입력하세요 : ", i == 0 ? "국어" : "영어");
				score[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s 점수 : ", i == 0 ? "국어" : "영어");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}

	}

}
