package ch12.exercise.problem9;

public class DecodingExample {
	public static void main(String[] args) {
		// UTF-8 인코딩 셋으로 세팅
		byte[] bytes = { -20, -107, -120, -21, -123, -107 };
		String str = new String(bytes);
		System.out.println("str: " + str);  // str: 안녕
	}

}
