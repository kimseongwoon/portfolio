package ch09.sec07.exam02;

public class HomeExample {
	public static void main(String[] args) {
		Home home = new Home();
		home.use2(); // 익명 객체 메소드 실행
		
		home.use3(
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("TV를 켭니다.");
					}
					@Override
					public void turnOff() {
						System.out.println("TV를 끕니다.");
					}
				}
			);
		}

}
