package com.kh.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMethod {

	public static void main(String[] args) {
		// stream에서 원하는 값을 얻어내기 위한 메서드들

		// 1) filter : 조건에 맞는 값만 추려주는 메소드
		String[] foods = { "마라탕", "마라탕", "김치찜", "김치찜", "삼겹살", "하와이안피자", "김밥", "짬뽕" };
		
		// 음식 이름이 "마"로 시작하는 음식만 추리기
		Arrays.stream(foods)
			  .filter( food -> food.charAt(0) == '마')
			  .forEach(System.out :: println); // forEach( food -> System.out.println(food))
		
		System.out.println("====== 중복값 제거 ======");
		// 2) distinct() : 중복값을 제거해주는 메소드
		List<String> arr = Arrays.asList(foods); // 배열을 컬렉션으로 변환
		
		arr.stream()
			.distinct()
			.filter(food -> food.charAt(0) == '마')
			.forEach(System.out :: println);
		
		// 3) map관련 메소드들
		// 3_1) mapXXX : 현재 요소를 XXX로 대체하여 스트림 반환.
		 System.out.println("----------- 맵 -------------");
		
		 arr.stream()
		 	.map( food -> {
		 		if(food.equals("하와이안피자")) {
		 			return food + "맛없다.";
		 		}else {
		 			return food + "맛있다.";
		 		}
		 	})
		 	.forEach(System.out :: println);
		
		 
		 String[] strArr = {"마라탕 훠궈 양꼬치 김밥", "경민 호호"};
		// 3_2) flatMapxxx : 특정요소가 여러개의 요소로 대체되는 stream 반환.
		System.out.println("==============================");
		List<String> arr2 = Arrays.asList(strArr);
		
		// 스페이스바 기준으로 각각의 음식을 String 요소로 만들기
		arr2.stream()
			.flatMap( food -> Arrays.stream(food.split(" ")) )
			.forEach(System.out :: println);
		

		
		// 3_3) asXXXstream(), boxed() : 형변환 관련 메소드
		int[] iArr = {1, 3, 5, 7, 9};
		
		// double로 형변환하여 출력
		Arrays.stream(iArr)
			  .asDoubleStream()
			  .forEach(System.out :: println);
		
		Arrays.stream(iArr)
			  .boxed()
		      .forEach(i -> System.out.println(i.hashCode()+" ") );
		
		
		// 4) sorted() : 정렬메소드
		
		// 5) 루프메소드
		// 5_1) forEach : 최종처리 스트림. -> 즉, 마지막에 호출해야 정상적으로 작동함.
		// 5_2) peek : 중간처리 메서드, 중간에 호출해야 정상작동함.
		
		System.out.println("---------------- peek -------------------");
		String str = arr.stream()
		   .distinct()
		   .filter( food -> food.length() == 3)
		   .peek( food -> System.out.println("남아있는 음식은 ??" + food))
		   //.forEach(System.out :: println);
		   //.count();
		   .findFirst()
		   .orElse(null);
		
		System.out.println(str);
		
		/*
		 * 6) 집계함수들
		 *    스트림의 마지막에 사용한다.
		 *    count() : 갯수를 반환.
		 * 	  sum() : 합계 반환
		 *    max() : 최대값 반환
		 *    min() : 최소값 반환
		 *    
		 * 7) 그외
		 *    findFirst() : 스트림의 첫번째 요소 반환
		 *    findAny() : 스트림의 값이 있다면 아무값이나 반환
		 *    orElse(대체값) : 값이 저장되어 있지 않다면 대체값 설정 가능 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
