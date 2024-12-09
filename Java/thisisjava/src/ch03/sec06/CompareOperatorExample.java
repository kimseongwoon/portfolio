package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "Java";
		
		// 문자열 비교연산(equals사용 -> ==, != 사용을 하면 안됨)
		boolean result8 = (str1.equals(str2));
		boolean result9 = (!str1.equals(str2));
		
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
		
		str1 = new String("Hello");
        str2 = new String("Hello");
        
        // == 연산자를 사용한 비교 (참조 비교)
        if (str1 == str2) {
            System.out.println("str1 == str2 : 참조가 동일합니다.");
        } else {
            System.out.println("str1 == str2 : 참조가 다릅니다.");
        }

        // equals() 메서드를 사용한 비교 (내용 비교)
        if (str1.equals(str2)) {
            System.out.println("str1.equals(str2) : 내용이 동일합니다.");
        } else {
            System.out.println("str1.equals(str2) : 내용이 다릅니다.");
        }
	}

}
