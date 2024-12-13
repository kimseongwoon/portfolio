package ch09.sec03.exam01;

public class AExample {
	public static void main(String[] args) {
		// 일반 인스턴스 클래스
		//A.B b = new A().new B();
		
		// static 중첩 클래스
		A.B b = new A.B();
	}

}
