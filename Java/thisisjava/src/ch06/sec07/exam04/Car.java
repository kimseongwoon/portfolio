package ch06.sec07.exam04;

public class Car {
	// 필드 선언
		String company = "현대";  // 회사이름
		String model;
		String color;
		int maxSpeed;
		
		// 생성자 선언(생성자 오버로딩을 이용)
		Car() { // 기본 생성자
			
		}
		Car(String model) {
			this.model = model;
		}
		Car(String model, String color) {
			this.model = model;
			this.color = color;
		}
		Car(String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
		Car(String model, int maxSpeed) {
			this.model = model;
			this.maxSpeed = maxSpeed;
		}
		Car(int maxSpeed, String model) {
			this.model = model;
			this.maxSpeed = maxSpeed;
		}

}
