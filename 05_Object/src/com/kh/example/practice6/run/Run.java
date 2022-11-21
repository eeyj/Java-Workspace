package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.inform();
		System.out.println("====================================");
		
		Book b2 = new Book("노인과 바다", "믿음사", "어니스트 헤밍웨이");
		b2.inform();
		System.out.println("====================================");
		
		Book b3 = new Book("노인과 바다", "믿음사", "어니스트 헤밍웨이", 7200, 0.3);
		b3.inform();

	}

}
