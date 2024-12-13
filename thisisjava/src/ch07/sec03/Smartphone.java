package ch07.sec03;

import ch07.sec03.Phone;

public class Smartphone extends Phone {
	
	public Smartphone(String model, String color) {
//		super();  // 부모 클래스의 기본생성자를 호출(생략 가능(컴파일 시 자동 추가됨))
//		this.model = model; // 부모 클래스에 있는 model
//		this.color = color; // 부모 클래스에 있는 color
		
		super(model, color);
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}

}
