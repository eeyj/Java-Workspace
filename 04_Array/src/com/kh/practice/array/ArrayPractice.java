package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0;i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length-i;
			
			System.out.print(arr[i] + " ");
		}
	}

	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
		String arr[] = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		String ch = sc.nextLine();		
		
		
		
		
	}
	
	
	
	
}




