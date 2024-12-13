package ch09.sec07.exam01;

public class Car {
	// 일반 객체
	private Tire tire1 = new Tire();
	
	// 익명 자식 객체
	Tire tire2 = new Tire() {
		@Override
		public void roll() { 
			System.out.println("익명 자식 객체 Tire1가 굴러갑니다.");
		}
	};
	
	public void run1() {
		tire1.roll();  // 일반 타이어가 굴러갑니다.
		tire2.roll();  // 익명 자식 객체 Tire1가 굴러갑니다.
	}
	
	public void run2() {
		// 익명 자식 객체
		Tire tire = new Tire() {
			@Override
			public void roll() { 
				System.out.println("익명 자식 객체 Tire2가 굴러갑니다.");
			}
		};
		tire.roll(); // 익명 자식 객체 Tire2가 굴러갑니다.
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}

}
