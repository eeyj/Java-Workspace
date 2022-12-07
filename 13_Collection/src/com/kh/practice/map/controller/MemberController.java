package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {

	private HashMap<String, Member> map = new HashMap<> ();
	
	public boolean joinMembership(String id, Member m) {
		
		boolean result = false;
		
		if(id == null) {
			map.put(id, m);
			result = true;
		}
				
		
		return result;
		
	}
	
	public String login(String id, String oldPw) {
		String name = null;
		if(map.containsKey(id)) {
			if(map.containsValue(oldPw)) {
				name = new Member().getName();
			}
		}
		
		return name;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		
		boolean result = false;
		if(map.containsKey(id)) {
			if(map.get(oldPw).equals(oldPw)) {
			
				
			}
		}
		
		return result;
	}
	
	public void changeName(String id, String newName) {
		
		
		
	}
	
	public TreeMap sameName(String name) {
		
	}
	
	
	
}
