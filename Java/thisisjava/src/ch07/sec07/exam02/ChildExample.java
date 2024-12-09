package ch07.sec07.exam02;

public class ChildExample {
	
	public static void main(String[] args) {
		Child child = new Child();

		// 자동 타입 변환이 이루어짐(자식 타입은 부모 타입으로 자동으로 변환가능)
		Parent parent = child;
		
		// 메소드 호출
		parent.method1();
		parent.method2();
		//parent.method3();  // error -> 부모 클래스 변수에는 method3() 메소드가 없기 때문
	}

}
