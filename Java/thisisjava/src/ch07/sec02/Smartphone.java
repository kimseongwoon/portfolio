package ch07.sec02;

//현재 자식 클래스 사용할 class. 
//해당 클래스는 Phone 부모클래스를 상속받음
public class Smartphone extends Phone {
	// 필드 선언
	public boolean wifi; // 와이파이 존재 여부
	
	public Smartphone(String model, String color) {
		super();  // 부모 클래스의 기본생성자를 호출
		this.model = model; // 부모 클래스에 있는 model
		this.color = color; // 부모 클래스에 있는 color
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경합니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}

}
