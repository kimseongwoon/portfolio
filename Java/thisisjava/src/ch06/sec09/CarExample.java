package ch06.sec09;

public class CarExample {
	
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");  // 생성자 호출
		Car yourCar = new Car("벤츠");  // 생성자 호출

		myCar.run();		// 메소드 호출
		yourCar.run();      // 메소드 호출
	}

}
