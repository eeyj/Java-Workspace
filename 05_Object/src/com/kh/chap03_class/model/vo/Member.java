package com.kh.chap03_class.model.vo;

public class Member {
	
	private String memberId; // - memberId : String
	private String memberPwd; 
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	public void changeName(String name) { // + changeName(name : String) : void
		memberName = name;
	}
	
	public void printName() { // + printName() : void
		System.out.println("멤버이름 : " + memberName);
	}
	
	

}
