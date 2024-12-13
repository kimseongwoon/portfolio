package ch05.sec05;

public class ReplaceExample {
	
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		String str2 = str1.replace("자바", "Java");
		
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
