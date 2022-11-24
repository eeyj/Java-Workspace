package com.kh.chap02_inherit.model.vo;

public class Vehicle {

	private String name;
	private double milage;
	private String kind;

	public Vehicle() {

	}

	public Vehicle(String name, double milage, String kind) {
		this.name = name;
		this.milage = milage;
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public double getMilage() {
		return milage;
	}

	public String getKind() {
		return kind;
	}

	public String information() {
		return "name : " + name + ", milage : " + milage + ", kind : " + kind;
	}

	public void howToMove() {
		System.out.println("움직인다.");
	}
	
	
	
	
}
