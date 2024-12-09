package ch09.sec03.exam02;

import ch09.sec03.exam02.A;

public class AExample {
	public static void main(String[] args) {
		// static 중첩 클래스
		// 중첩 인스턴스 클래스 필드 및 메소드 호출
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		// static 정적 중첩 클래스 필드 및 메소드 호출
		System.out.println(A.B.field2);
		A.B.method2();
	}

}
