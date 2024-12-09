package ch06.sec10.exam01;

public class Calculator {
	String color;  // 인스턴스 필드(멤버 변수)
	static double pi = 3.14159;  // 정적 필드(정적 멤버 변수)
	
	void setColor(String color) {	// 인스턴스 메소드(멤버 메소드)
		this.color = color;
	}
	
	static int plus(int x, int y) { return x + y; }  // 정적 메소드(정적 멤버 메소드)
	static int minus(int x, int y) { return x - y; }  // 정적 메소드(정적 멤버 메소드)
	
}
