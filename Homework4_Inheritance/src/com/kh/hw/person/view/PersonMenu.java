package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {

		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.printf("현재 저장된 학생은 %d명입니다.\n", pc.personCount()[0]);
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.printf("현재 저장된 사원은 %d명입니다.\n", pc.personCount()[1]);

			System.out.println();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine()); //  nextInt() 대신 nextLin()으로 형변환을 하면 nextLine()으로 한번더 입력버퍼를 날릴 필요가 없다.

			switch (num) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public void studentMenu() {
		// 내가 푼것
		while (true) {
			System.out.println();
			System.out.println("1. 학생추가");
			System.out.println("2. 학생보기");
			System.out.println("9. 메인으로");
			int num = 0;
			if (pc.personCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
				System.out.print("메뉴 번호 : ");
				num = Integer.parseInt(sc.nextLine());
				switch (num) {
				case 2:
					printStudent();
					break;
				case 9:
					System.out.println();
					System.out.println("메인으로 돌아갑니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
			} else {
				System.out.print("메뉴 번호 : ");
				num = Integer.parseInt(sc.nextLine());
				switch (num) {
				case 1:
					insertStudent();
					break;
				case 2:
					printStudent();
					break;
				case 9:
					System.out.println();
					System.out.println("메인으로 돌아갑니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}

			}

		}

	}

	public void employeeMenu() {
		// 선생님 풀이 버전 -------- > 학생 메뉴와 비교해보기
		while (true) {
			int personCount = pc.personCount()[1];
			
			if(personCount != 10) {
				System.out.println("1. 사원 추가");
			}
			System.out.println("2. 사원보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 2: printEmployee(); break;
			case 9: System.out.println("메인으로 돌아갑니다."); return;
			case 1 : 
				if(personCount != 10) {
					insertEmployee();
					break;
				}
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

	}

	public void insertStudent() {

		while (true) {
			System.out.println();
			System.out.print("학생 이름 : ");
			String name = sc.nextLine();
			System.out.print("학생 나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("학생 키 : ");
			double height = Double.parseDouble(sc.nextLine());
			System.out.print("학생 몸무게 : ");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.print("학생 학년 : ");
			int grade = Integer.parseInt(sc.nextLine());
			System.out.print("학생 전공 : ");
			String major = sc.nextLine();

			pc.insertStudent(name, age, height, weight, grade, major);

			if (pc.personCount()[0] != 3) {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 :");
				char select = sc.nextLine().charAt(0); 
				if (select == 'N' || select == 'n') { 
					 break;
				}
			} else { //---->>>>> 새로운 if문으로 꾸며줘도 됨. 
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				break;
			}

		}

	}

	public void printStudent() {

		System.out.println();
		for (int index = 0; index < pc.printStudent().length; index++) {
			System.out.println(pc.printStudent()[index]);
		}

	}

	public void insertEmployee() {

		while (true) {
			System.out.println();
			System.out.print("사원 이름 : ");
			String name = sc.nextLine();
			System.out.print("사원 나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("사원 키 : ");
			double height = Double.parseDouble(sc.nextLine());
			System.out.print("사원 몸무게 : ");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.print("사원 급여 : ");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();

			pc.insertEmployee(name, age, height, weight, salary, dept);
			
			if (pc.personCount()[1] != 10) {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 :");
				char select = sc.nextLine().toUpperCase().charAt(0);
				if (select == 'N') {
					break;
				}
			} else {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				break;
			}

		}

	}

	public void printEmployee() {

		System.out.println();
		for (int index = 0; index < pc.printEmployee().length; index++) {
			System.out.println(pc.printEmployee()[index]);
		}

	}

}
