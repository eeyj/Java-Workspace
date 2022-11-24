package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle {

	private int tire;
	
	public Car() {
		
	}
	public Car(String name, double milage, String kind, int tire) {
		super(name, milage, kind);
		this.tire = tire;
		
	}
	
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	@Override
	public String information() {
		return super.information() + ", tire : "+tire;
	}
	
	@Override
	public void howToMove() {
		System.out.println("엑셀을 밟으면 움직인다.");
	}
	
	
	
	
}
