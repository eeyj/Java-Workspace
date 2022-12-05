package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴번호 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: saveScore(); break;
			case 2: readScore(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
		
	}
	
	public void saveScore() {
		
		int num = 0;
		while(true) {
			System.out.printf("%d번째 학생 정보 기록 \n", ++num);
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어 점수 : ");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.print("영어 점수 : ");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.print("수학 점수 : ");
			int math = Integer.parseInt(sc.nextLine());
			int sum = kor+eng+math;
			double avg = sum/3;
			
			scr.saveScore(name, kor, eng, math, sum, avg);
			
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무키나 입력하세요 : ");
			char confirm = sc.nextLine().charAt(0);
			// char confirm = sc.nextLine().toUpperCase().charAt(0); // 어떤 문자든 대문자로 변환
			if(confirm == 'n' || confirm == 'N') {
				break;
				
			} 
		}
	}
	
	public void readScore() {
		
		int count = 0;
		int sumAll = 0;
		double avgAll = 0;
//		System.out.println("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학 "+ "\t" + "총점" + "\t"+"평균");
//		
//		try(DataInputStream dis = scr.readScore()){
//			String value;
//			while((value = dis.readLine()) != null) {
//				System.out.println(value);
//				sumAll += Integer.parseInt(value.split("\t")[4]);
//				count++;
//			}
//			avgAll = ((double)sumAll / (count*3));
//			
//			throw new EOFException();
//			
//			
//		} catch (EOFException e) {
//			System.out.println("읽은 횟수" + "\t" + "전체 합계" + "\t" + "전체 평균");
//			System.out.println(count + "\t" + sumAll + "\t" + avgAll);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		}
//				
		
		try(DataInputStream dis = scr.readScore()){
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			
			String value = null;
			while((value = dis.readUTF()) != null) {
				System.out.println(value);
				count++;
				String[] result = value.split("\t");
				sumAll += Integer.parseInt(result[4]);
				avgAll += Integer.parseInt(result[5]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			
			System.out.println("읽은 횟수\t전체 합계\t전체 평균");
			System.out.println(count + "\t" + sumAll + "\t" + (avgAll/count));
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
