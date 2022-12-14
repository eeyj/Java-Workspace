package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.*;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {

		int[] count = new int[2];
		count[0] = 0; // -------> 현재 저장됟 학생 수 
		count[1] = 0; // -------> 현재 저장된 사원 수
		for (Student student : s) {
			if (student != null) {
				count[0]++;
			}
		}

		for (Employee employee : e) {
			if (employee != null) {
				count[1]++;
			}
		}
		
		return count;

	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {

		for (int index = 0; index < s.length; index++) {
			if (s[index] == null) {
				s[index] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}

	}

	public Student[] printStudent() {
		// 내가 푼것....
//		Student[] printStd = new Student[personCount()[0]];
//		int resultIndex = 0;
//		for (int index = 0; index < s.length; index++) {
//			if (s[index] != null) {
//				printStd[resultIndex] = s[index];
//				resultIndex++;
//			}
//		}
//		return printStd;
		return s; // --------------> 선생님 풀이 
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {

		for (int index = 0; index < e.length; index++) {
			if (e[index] == null) {
				e[index] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}

	public Employee[] printEmployee() {
//		Employee[] printEmp = new Employee[personCount()[1]];
//		int resultIndex = 0;
//		for (int index = 0; index < e.length; index++) {
//			if (e[index] != null) { 
//				printEmp[resultIndex] = e[index];
//				resultIndex++;
//			}
//		}
//		return printEmp;
		return e;
		
	}

}
