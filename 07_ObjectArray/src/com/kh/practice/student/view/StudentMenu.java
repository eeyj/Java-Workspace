package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		
		System.out.println("==========학생 정보 출력==========");
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		
		//printStudent 값을 저장하기 위해 Student 객체 배열을 재선언 해당 객체배열에 값을정장
	    Student[] sArr = ssm.printStudent();
	    
	    // Student 객체 std 선언 해당 std.inform 메소드를 반복하여 실행
	    for(Student std : sArr) {
	    	System.out.println(std.inform());
	    }
		
		System.out.println();
		
		System.out.println("==========학생 성적 출력==========");
		double[] avg = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + (int)avg[0]);
		System.out.println("학생 점수 평균 : " + avg[1]);
		
		System.out.println();
		System.out.println("==========성적 결과 출력==========");

		for(Student std : sArr) {
			String result = "통과";
			if(std.getScore() < ssm.CUT_LINE) {
				result = "재시험 대상";
			}
			
			System.out.printf("%s학생은 %s입니다.\n", std.getName(),result);
			
			
			
		}
		
		
		
	    
		
		
		
		
		
		
	}
	

}
