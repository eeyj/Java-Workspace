package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {
	
	private String[] result = new String[2];
	
	public String[] method() {
		
		Phone[] p1 = new Phone[2];
		
		p1[0] = new GalaxyNote9();
		p1[1] = new V40();
		
		for(Phone phone : p1) {
		
		}
		
		
		return result;
		
		
		
	}

}
