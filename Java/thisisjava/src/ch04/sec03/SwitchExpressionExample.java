package ch04.sec03;

public class SwitchExpressionExample {
	
	public static void main(String[] args) {
		char grade = 'B';
		
		// jdk 12버전 이후부터 사용 가능
		switch(grade) {
			case 'A', 'a' -> {
				System.out.println("우수 회원입니다.");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원입니다.");
			}						
			default -> {
				System.out.println("손님입니다.");
			}
		}

		// 한 줄 실행문은 '{}' 생략 가능
		switch(grade) {
			case 'A', 'a' -> System.out.println("우수 회원입니다.");
			case 'B', 'b' -> System.out.println("일반 회원입니다.");						
			default -> System.out.println("손님입니다.");
		}

	}

}
