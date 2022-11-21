package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {

	// 필드부
	private int[] lotto = new int[6];

	// 초기화블럭(!!!!!!!!!중복하지 않는!!!!!!!!! 1~45까지의 난수들)
	{
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45 + 1);
			lotto[i] =random; 
			for(int j = 0; j < i; j++) {
				if(lotto[j] == random) {
					i--;
					break;
				}
			}
		}
	}

	// 생성자부-기본생성자
	public Lotto() {
		//super();
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

	public int[] getLotto() { 
		return lotto;
	}

	// 출력메서드(반복문을 이용해서 배열 출력)
	public void information() {
		System.out.println(Arrays.toString(lotto));
		
		/*for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}*/
		
	}

}