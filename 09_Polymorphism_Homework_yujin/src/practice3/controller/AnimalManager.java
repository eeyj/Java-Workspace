package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] animal = new Animal[5];
		
		animal[0] = new Cat("사모님", "코리안숏헤어","한국","젖소무늬");
		animal[1] = new Dog("뭉자","푸들", 3);
		animal[2] = new Cat("누리", "코리안숏헤어","한국","치즈");
		animal[3] = new Cat("다리", "코리안숏헤어","한국","치즈");
		animal[4] = new Dog("밤비","꼬동", 6);
		
		for(Animal animals : animal) {
			animals.speak();
		}
		
		
		
	}

}
