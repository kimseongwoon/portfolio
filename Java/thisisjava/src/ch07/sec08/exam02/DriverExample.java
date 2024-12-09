package ch07.sec08.exam02;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.driver(new Vehicle());   // 매개값으로 vehicle객체(자식 클래스)로 전달
		driver.driver(new Bus());   // 매개값으로 bus객체(자식 클래스)로 전달
		driver.driver(new Taxi());  // 매개값으로 taxi객체(자식 클래스)로 전달
	}

}
