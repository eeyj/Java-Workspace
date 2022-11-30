package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	
	public TokenController() {
		super();
	}
	
	public String afterToken(String str) {
		
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		//내가 푼것
//		String result = "";
//		while(stn.hasMoreTokens()) {
//			result += stn.nextToken();
//		}
//		return result;

		//방법 2. StringBuffer or StringBuilder 이용
		StringBuilder sb = new StringBuilder();
		
		while(stn.hasMoreTokens()) {
			sb.append(stn.nextToken());
		}
		
		return sb.toString();
	
	}

	public String firstCap(String input) {
		
		//substring(0 , 1);  -----> 0번째 인덱스부터 1번째 인덱스까지 추출
		String upper = input.substring(0, 1).toUpperCase();
		
		
		return upper+input.substring(1);
		
	
	}
	
	public int findChar(String input, char one) {
		
		//내가 푼거
		int count = 0;
		char[] arr = input.toCharArray();
		for(int i =0 ; i < arr.length; i++) {
			if(arr[i] == one) {
				count++;
			}
		}

		//방법 1 .
//		for(int i = 0; i<input.length();i++) {
//			if(input.charAt(i) == one) {
//				count++;
//			}
//		}
//		
		
		return count;
	}

	
	
}
