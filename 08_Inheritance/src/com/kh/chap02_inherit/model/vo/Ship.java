package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle {
	
	private int propeller;
	
	public Ship() {
		
	}
	
	public Ship(String name, double milage, String kind, int propeller) {
		super(name, milage, kind);
		this.propeller = propeller;
	}

	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}

	@Override
	public String information() {
		
		return super.information() + ", propeller : " + propeller;
	}
	
	@Override
	public void howToMove() {
		System.out.println("프로펠러가 돌아가면서 움직인다.");
	}
}
