package ch06.sec06;

public class CarExample {
	
	public static void main(String[] args) {
		Car myCar = new Car(); // Car클래스를 인스턴스화(객체 생성)
		
		// myCar의 필드값 읽기(in Car)
		System.out.println("모델명: " + myCar.model); // 아반떼
		System.out.println("색깔: " + myCar.color); // null
		System.out.println("현재속도: " + myCar.speed); // 300
		
		// 필드 사용(필드 값 변경)
		myCar.speed = 200; // 필드 speed의 값을 200으로 변경
		
		System.out.println("수정되ㅑㄴ 속도: " + myCar.speed); // 200
	}

}
