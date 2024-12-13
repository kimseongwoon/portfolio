package ch07.sec02;

public class SmartphoneExmple {  
	
	public static void main(String[] args) {
		// 2개의 매개변수를 가진 생성자 호출
		Smartphone myPhone = new Smartphone("갤럭시", "은색");

		// Phone 으로부터 상속받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색깔: " + myPhone.color);
		
		// SmartPhone의 필드 읽기
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
		// Phone 으로부터 상속받은 부모 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요.");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		myPhone.sendVoice("아~ 네, 반갑습니다.");
		myPhone.hanUp();
		
		// SmartPhone의 자식 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}


}
