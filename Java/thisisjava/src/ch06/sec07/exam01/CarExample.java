package ch06.sec07.exam01;

public class CarExample {
	
	public static void main(String args[]) {
		// 기본생성자가 호출
		Car myCar1 = new Car(); 
		
		// 3개의 매개변수를 가진 생성자가 호출
		Car myCar2 = new Car("람보르기니", "노란색", 400);
		
		Car myCar3 = new Car("부가티 베이론", "회색");
	}

}
