package ch05.sec05;

public class LengthExample {
	
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		System.out.println(str1.length() + "자");
		
		String ssn = "9506241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
	}

}
