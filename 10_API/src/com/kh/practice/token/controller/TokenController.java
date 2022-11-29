package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	
	public TokenController() {
		super();
	}
	
	public String afterToken(String str) {
		
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		String result = "";
		
		while(stn.hasMoreTokens()) {
			result += stn.nextToken();
		}
		
		return result;
	}

	public String firstCap(String input) {
		
		return input.toUpperCase();
		
	
	}
	
	public int findChar(String input, char one) {
		
		char[] arr = input.toCharArray();
		
		int count = 0;
		for(int i =0 ; i < arr.length; i++) {
			if(arr[i] == one) {
				count++;
			}
		}
		
		return count;
	}

	
	
}
