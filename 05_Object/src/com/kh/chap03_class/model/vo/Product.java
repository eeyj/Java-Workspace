package com.kh.chap03_class.model.vo;

public class Product {
	// 클래스 선언 구문에 사용 가능한 접근제한자 : public, default
	// public으로해야 다른 패키지에서 접근 가능
	// default로 설정한 경우 같은 패키지에서만 접근 가능. / 다른 패키지에서 접근 불가
	
	// 상품명, 상품가격, 브랜드
	
	private String pName;
	private int price;
	private String brand = "애플";
	
	// setter메서드 3개
	public void setpName(String pName) { //단어 두개가 이어질때 두번째 단어는 대문자로 시작하는것이 원칙(낙타등표기법)이나 필드명이 중간에 대문자로 이미 있는 경우 예외적으로 시작 알파벳을 소문자로 시작해도 된다.
		                                 //자바스프링에서는 대문자(시작점)를 각각의 단어로 인식하기 때문에, 
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	// getter메서드 3개
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	public String getBrand() {
		return brand;
	}
	
	//모든 필드값을 하나의 문자열로 합쳐서 반환해주는 information메서드
	public String information() {
		return "상품명 : " + pName +", 가격 : " + price+ "원, 브랜드 : " + brand;
		
	}
	
	
	
	
}
