package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;

			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.println(arr[1]);
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		char[] arr = new char[str.length()];
		int count = 0;
		String index = "";

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if (arr[i] == ch) {
				index += i + " ";
				count++;
			}
		}
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s \n",str,ch,index);
		System.out.printf("%c 개수 : %d" , ch, count);
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		String[] week = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

		if (num<0 || num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(week[num]);
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num2 = sc.nextInt();
			arr[i] = num2;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum =+ arr[i];
		}
		System.out.printf("\n총 합 : %d", sum);
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if(num < 3 || num % 2 == 0) {
			System.out.println("다시 입력하세요.");
			practice8();
		} else {
			int[] arr = new int[num];
			
			//0, 1, 2 -> 1, 2, 3
			for(int i = 0; i <= num/2; i++) {
				arr[i] = i+1;
			}
			
			int value = 1;
			for(int i = (num/2+1); i < arr.length; i++) {
				arr[i] = num/2 + 1 -value;
				value++;
			}
			
			for(int i = 0; i<arr.length;i++) {
				System.out.print(arr[i] + (i == arr.length-1 ? "" : ", "));
				
			}
		}
		
		
		
		
		/*if (num >= 3 || num % 2 == 0) { -----------------------------> 내가 푼것
			int[] array = new int[num];
			for (int i = 0; i <= num / 2; i++) {
				array[i] = i + 1;
				System.out.print(array[i] + " ");
			}
			for (int i = num/2; i > 0; i--) {
				array[i] = i;
				System.out.print(array[i] + " ");
			}
		} else {
			System.out.println("다시 입력하세요.");
			practice8();
		}*/

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();

		String[] chiken = { "양념", "후라이드", "반반" };

		for (int i = 0; i < chiken.length; i++) {
			if (str.equals(chiken[i])) {
				System.out.printf("%s치킨 배달 가능", str);
				return;
			}
		}
		System.out.printf("%s치킨은 없는 메뉴입니다.", str);
	}

}
