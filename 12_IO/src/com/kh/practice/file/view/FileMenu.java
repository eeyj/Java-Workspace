package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();

	public void mainMenu() {

		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}

		}

	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str = sc.nextLine();
			if(str.equals("ex끝it")) {
				break;
			}
			sb.append(str+"\n"); // 내용을 저장할때 줄바꿈이 되도록 미리 줄바꿈 기호(\n) 삽입
		}
		while(true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myfile.txt) : ");
			
			String file = sc.nextLine();
			if(fc.checkName(file)) { // 입력한 file이라는 이름이 존재하는 경우
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) ");
				char confirm = sc.nextLine().charAt(0);
				if(confirm == 'y' || confirm == 'Y') { // 덮어씌우기 할지
					fc.fileSave(file, sb);
				}else { // 이어쓰기 할지
					continue; // while 문으로 다시 돌아가서 저장할 파일명을 물어보게 // 아래 break문을 만나지 않음
				}
			}else { // 입력한 file명이 없는 경우
				fc.fileSave(file, sb);
			}
			break;	
		}
		
		
	}

	public void fileOpen() {

		System.out.print("열 파일 명 : ");
		String file = sc.nextLine();
		if (fc.checkName(file)) {
			System.out.println(fc.fileOpen(file)); // StringBuilder 형 이지만 tostring 자동으로 변환되어 sysout사용 가능
		} else {
			System.out.println("없는 파일입니다.");
		}

	}

	public void fileEdit() {

		System.out.print("수정할 파일 명 : ");
		String file = sc.nextLine();
		if (fc.checkName(file)) {
			StringBuilder sb = new StringBuilder();
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String str = sc.nextLine();
				if(str.equals("ex끝it")) {
					break;
				}
				sb.append(str+"\n"); 
			}
			fc.fileEdit(file, sb);
		} else {
			System.out.println("없는 파일입니다.");
		}

	}

}
