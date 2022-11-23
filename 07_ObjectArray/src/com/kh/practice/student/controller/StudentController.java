package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	//StudentController 기본생성자
	//5개의 객체배열을 샘플 데이터의 값으로 초기화 해주는 객체생성잔
	public StudentController() {
		
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	public Student[] printStudent() {
		//객체 배열에 있는 데이터 반환
		
		
		return sArr;
		
	}
	
	public int sumScore() {
		//객체 배열의 점수를 합한 값을 리턴
		
		// 합계를 저장할 변수 선언
		int sum = 0;
		// 배열을 반복하면서 학생 점수를 더하는 반복문
		for(Student std : sArr) {
			sum += std.getScore();
			
		}
	
		return sum;
		
	}
	
	public double[] avgScore() {
		// double 배열을 생성
		double[] avg = new double[2];
		
		//0번째 인덱스에 sumScore()의 리턴값을 저장
		avg[0] = sumScore();
		//1번째 인덱스에는 평균값을 저장
		avg[1] =  avg[0]/sArr.length;
		
	
		return avg;
		
	}
	
	
}
