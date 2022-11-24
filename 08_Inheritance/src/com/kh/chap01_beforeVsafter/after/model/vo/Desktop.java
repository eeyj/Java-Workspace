package com.kh.chap01_beforeVsafter.after.model.vo;


             // 자식          부모
             // 후손          조상
             // 하위          상위
public class Desktop extends Product {
	
	private boolean allInone;
	
	public Desktop() {
		//super();  ----->>> 상속을 클래스명에 선언하여 super();를 기본생성자에 소환시 부모클래스의 주소값이 참조됨
		//          ----->>> Prodect클래스는 기본적으로 Object를 부모클래스로 가지고 있기때문에 Desktop클래스도 Object클래스를 상속함
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInone) {
		// super => 부모클래스의 주소값을 보관하고 있음(즉, super. 으로 부모에 접근가능)
		// brand, pCode, pName, price를 부모클래스의 Product에 있는 필드에 초기화(대입)
		
		// 해결방법 1. 부모클래스의 필드를 자식까지는 접근가능하도록 접근제한자를 변경하는 방법
		//           private -> protected로 변경 (비추천)
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
//		
		// 해결방법 2. 부모클래스에서 접근할 수 있는(public) setter메서드 활용.
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		
		// 해결방법 3. 부모생성자 호출하기 단, 반드시 첫줄에 기술되어야한다. 
	    super(brand, pCode, pName, price);
		this.allInone = allInone;	
		
	}
	
	
	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}
	
	public boolean getAllInone() {
		return allInone;
	}
	
	//오버라이딩 : 부모클래스의 메소드를 내 입맛대로 정의하는 것
	public String infomation() {
		return super.information() + ", allInone : " +allInone;
		
	}
	
	

}
