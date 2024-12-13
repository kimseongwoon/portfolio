package ch05.sec05;

public class CharAtExample {
	
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		System.out.println(str1.charAt(4));
		System.out.println(str1.charAt(5));
		System.out.println(str1.charAt(6));
		System.out.println(str1.charAt(7));
		
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
	}

}
