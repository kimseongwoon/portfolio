package ch06.sec10.exam03;

public class ClassName {
	// 인스턴스 필드와 메소드
	int field1;
	void method1() {
		
	}
	
	// 정적 필드와 메소드
	static int field2;
	static void method2() {
		
	};
	
	static {
		//field1 = 10;  // error
		field2 = 10;  // no error(static이여서)
		
		//method1();    // error
		method2();    // no error(static이여서)
	}
	
	// 정적 메소드
	static void method3() {
		//this.field1 = 10;  // error
		//this.field2 = 10; // error -> static필드에는 this키워드 사용 불가
		field2 = 10; // no error
		//this.method1();   // error
		//this.method2();   // error -> static필드에는 this키워드 사용 불가
		method2();   // no error
		
		// 본인의 클래스 객체 생성
		ClassName obj = new ClassName();
		// 정적 메소드안이라도 객체로 생성한 인스턴스 멤버들을 사용 가능
		obj.field1 = 10;
		obj.method1();
	}

}
