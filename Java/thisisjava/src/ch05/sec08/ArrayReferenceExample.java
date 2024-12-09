package ch05.sec08;

public class ArrayReferenceExample {
	
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "C++";
		strArray[2] = "C#";
		
		System.out.println(strArray[0] == strArray[1]);  // false(다른 객체)
		System.out.println(strArray[0] == strArray[2]);  // false(다른 객체)
		System.out.println(strArray[1] == strArray[2]);  // false(다른 객체)
		
		// 객체를 참조하는 배열 예제
		String[] languages = new String[3];
		languages[0] = "Java";
		languages[1] = "Java";
		languages[2] = new String("Java");
		
		System.out.println(languages[0] == languages[1]);       // true -> 같은 객체 
		System.out.println(languages[0] == languages[2]);       // false -> 객체로 비교 -> 다른 객체 
		System.out.println(languages[0].equals(languages[2]));  // true -> 값으로만 비교
	}

}
