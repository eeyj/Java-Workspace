package com.kh.chap02_objectarray.run;

import java.util.Scanner;

import com.kh.chap02_objectarray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		Phone[] arr = new Phone[3];
		
		//arr[] 배열 객체 0번째 인덱스에 기본생성자로 초기화 
		//각 인덱스에 setter메소드를 통해 값을 대입
		arr[0] = new Phone();
		arr[0].setName("아이폰");
		arr[0].setSeries("12");
		arr[0].setBrand("애플");
		arr[0].setPrice(1000000);
		
		
		//arr[] 배열 객체 1,2번째 인덱스에 매개변수 있는 생성자로 초기화와 동시에 값할당
	    arr[1] = new Phone("아이폰", "13", "애플", 1500000);
		
	    arr[2] = new Phone("갤럭시", "zlip4" , "삼성", 1350000);
		
	    
	    int sum = 0;
	    for(int i = 0; i < arr.length; i++) {
	    	System.out.println(arr[i].information());
	    	sum += arr[i].getPrice();
	    	
	    	
	    }
	    
		System.out.println("총 가격 : " + sum + "원");
		System.out.println("평균가격 : "+ (sum/arr.length) + "원");

	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}