package ch07.sec02;

// 현재 부모 클래스 사용할 class
// 일반적으로 폰이 가지고 있는 속성과 동작을 정의 및 선언 
public class Phone {
	// 필드 선언 
	public String model;       // 폰의 모델명 
	public String color;       // 폰의 색깔 
	
	// 메소드 선언 
	
	// 벨이 울릴 때 동작하는 메소드
	public void bell() {
		System.out.println("벨이 울립니다.") ;
	} 
	
	// 목소리를 전달할 때 동작하는 메소드
	public void sendVoice(String message) {
		System.out.println("본인: " + message) ;
	}
	// 목소리를 받을 때 동작하는 메소드 
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message) ;
	}
	
	// 전화를 끊을 때 동작하는 메소드
	public void hanUp() {
		System.out.println("전화를 끊습니다") ;
	}
	
}
