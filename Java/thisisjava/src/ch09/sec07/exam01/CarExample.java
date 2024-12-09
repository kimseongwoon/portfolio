package ch09.sec07.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.run2(); // 익명 객체 메소드 실행
		
		car.run1();
		
		car.run3(
			new Tire() {
				@Override
				public void roll() { 
					System.out.println("익명 자식 객체 Tire3가 굴러갑니다.");
				}
			}
		);
	}

}
