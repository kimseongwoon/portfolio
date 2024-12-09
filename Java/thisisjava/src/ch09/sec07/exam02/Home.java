package ch09.sec07.exam02;

import ch09.sec07.exam01.Tire;

public class Home {
	// 인터페이스 익명 객체
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	public void use2() {
		// 로컬 변수에 익명 구현 객체 대입
		RemoteControl rc2 = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}
		};
		rc2.turnOn();	// TV를 켭니다.
		rc2.turnOff();  // TV를 끕니다.
	}
	
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}

}
