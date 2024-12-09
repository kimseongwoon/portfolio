package ch07.sec04;

public class Computer extends Calculator {
	@Override   // 부모 클래스의 메소드 중 아래 메소드이름과 같은 이름이 있다라는 것을 명시
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
