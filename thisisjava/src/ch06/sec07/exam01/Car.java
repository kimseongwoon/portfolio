package ch06.sec07.exam01;

public class Car {
	
	// 멤버 변수(필드)
		int speed;
		String name;
		
		// 생성자 선언(필드값을 초기화하는 경우 많이 사용)
		public Car() { // 기본 생성자(생략이 가능)
			System.out.println("기본생성자 호출이 되었음");
		}
		
		// 3개의 매개변수를 가진 생성자 선언
		public Car(String model, String color, int maxSpeed) {
			System.out.println("3개의 매개변수를 가진 생성자 호출이 되었음");
			
			speed = 10;
		}
		
		// 2개의 매개변수를 가진 생성자 선언
		public Car(String model, String color) {
			System.out.println("2개의 매개변수를 가진 생성자 호출이 되었음");
		}

}
