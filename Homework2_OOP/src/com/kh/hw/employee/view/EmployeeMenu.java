package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();

	public EmployeeMenu() {
		// 메뉴 안내가 되고 메뉴 번호에 따라 같은 클래스에 있는 메소드 실행
		// 번호를 잘못 입력했으면 잘못 입력했다는 안내가 뜸
		while (true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			int num = sc.nextInt();

			if (num == 1) {
				insertEmp();

			} else if (num == 2) {
				updateEmp();

			} else if (num == 3) {
				sc.nextLine();
				deleteEmp();

			} else if (num == 4) {
				printEmp();

			} else if (num == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				System.out.println("잘못 입력하셨습니다.");
			}

		}

	}

	public void insertEmp() {
		// 사원 번호, 사원 이름, 사원 성별, 전화 번호는 기본적으로 받고
		System.out.print("사원 번호 : ");
		int empNo = sc.nextInt();

		sc.nextLine();

		System.out.print("사원 이름 : ");
		String name = sc.nextLine();

		System.out.print("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("전화 번호 : ");
		String phone = sc.nextLine();

		// 추가적인 정보를 더 입력할 것인지 물어본 후
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		char confirm = sc.nextLine().charAt(0);

		// 입력하겠다고 하면 사원부서, 사원 연봉, 보너스 율을 추가로 더 받고
		// 모든 데이터를 EmployeeController의 add메소드 인자로 보냄
		// 추가정보를 입력하지 않겠다고 하면 기본정보만 add메소드 인자로 보냄

		if (confirm == 'y' || confirm == 'Y') {
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();

			System.out.print("사원 연봉 : ");
			int salary = sc.nextInt();

			System.out.print("보너스 율 : ");
			double bonus = sc.nextDouble();

			ec.add(empNo, name, gender, phone, dept, salary, bonus);

		} else {
			ec.add(empNo, name, gender, phone);

		}

	}

	public void updateEmp() {
		// 사원 정보 수정에 대한 메뉴 안내가 출력되고
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화 번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");

		// 사용자가 수정하고 싶은 내용에 대한 번호를 입력
		System.out.print("메뉴번호를 누르세요 : ");
		int num = sc.nextInt();

		if (num == 1) {
			sc.nextLine();
			System.out.print("수정할 전화 번호 : ");
			String phone = sc.nextLine();
			ec.modify(phone);

		} else if (num == 2) {
			System.out.print("수정할 사원 연봉 : ");
			int salary = sc.nextInt();
			ec.modify(salary);

		} else if (num == 3) {
			System.out.print("수정할 보너스 율 : ");
			double bonus = sc.nextDouble();
			ec.modify(bonus);

		} else if (num == 9) {
			System.out.println("메인메뉴로 돌아갑니다.");
		}

	}

	public void deleteEmp() {
		// 정말 삭제할 것인지 물어본 후 삭제하겠다고 하면
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char cf = sc.nextLine().charAt(0);

		// EmployeeController의 remove()메소드를 호출하여 반환 값에 따라
		// 데이터 삭제에 실패하였는지 성공하였는지 출력
		if (cf == 'y' || cf == 'Y') {
			ec.remove();
			System.out.println("데이터 삭제에 성공하였습니다.");
		}

	}

	public void printEmp() {
		if (ec.inform() == null) {
			System.out.println("사원 데이터가 없습니다.");
		}
		System.out.println(ec.inform());

	}

}
