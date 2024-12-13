package ch08.sec02;

public class RemoteControlExample { 
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();  // turnOn은 Television에 있는 메소드를 호출
		rc.turnOff();
		rc.setVolume(5);
		
		rc = new Audio();
		rc.turnOn();  // turnOn은 Audio에 있는 메소드를 호출
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println(RemoteControl.ABCD);
		System.out.println("리모톤 최대 볼륨치: " + RemoteControl.MAX_VOLUME);
		System.out.println("리모톤 최소 볼륨치: " + RemoteControl.MIN_VOLUME);
		
		rc.setMute(false);
		rc.setMute(true);
		
		// 정적 메소드 호출
		RemoteControl.changeBattery();
	}

}
