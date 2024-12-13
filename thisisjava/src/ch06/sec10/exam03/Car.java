package ch06.sec10.exam03;

public class Car {
	int speed;			// 인스턴스 필드
		
		void run() { // 인스턴스 메소드
			System.out.println(speed + "으로 달립니다.");
		}		
		
		static void simulate() {
			//객체 생성
			Car myCar = new Car();
			//인스턴스 멤버 사용
			myCar.speed = 200;
			myCar.run();
		}
		
		public static void main(String args[]) {
			//speed = 60; // error
			//run();		// error
			
			//정적 메소드 호출
			simulate();
					
			Car myCar = new Car();
			myCar.speed = 60;
			myCar.run();
		}

}
