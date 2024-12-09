package ch06.sec13.exam02.package1;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A(boolean b) { // public으로 접근 제한자 생성
		
	}
	
	A(int b) { // default로 접근 제한자 생성
		
	}
	
	private A(String s) { // private으로 접근 제한자 생성
		
	}

}
