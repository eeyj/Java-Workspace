package com.kh.chap03_sync.run;

import com.kh.chap03_sync.sync.*;

public class Run {

	public static void main(String[] args) {

		Buffer buffer = new Buffer();
		Thread producer = new Producer(buffer); //Thread 클래스를 상속받았기 때문에 업캐스팅을 이용해 생성자 사용 가능
		Thread consumer = new Thread(new Consumer(buffer));  // implements 구현만 했기에 직접 생성자 생성안됨
		
		producer.start();
		consumer.start();
		
		
		
		
		
		
		
		
		
		
	}

}
