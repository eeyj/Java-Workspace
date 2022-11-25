package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.*;

// 다형성 적용전 클래스
public class ElectronicController1 {
	
	// 용산 전자 상가에 새로 차린 가게 
	private Desktop desk;
	private NoteBook note;
	private Tablet tap;
	
	// 현재 용산 전자 상가에 데스크탑을 납품하는 메소드
	public void insert(Desktop d) {
		//desk = new Desktop("삼성", "데탑", 900000, "Geforce 1070");
		desk = d;
	
	}
	
	// 노트북을 납품하는 메소드
	public void insert(NoteBook n) {
		note = n;
	}
	
	// 태블릿 납품하는 메소드
	public void insert(Tablet t) {
		tap = t;
	}
	
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tap;
	}
	
	
	
	
	
	
	
	
	
	
}
