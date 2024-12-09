package ch11.sec05;

public class ThrowExample2 {
	public static void main(String[] args) throws Exception {
		// try-catch문이 없는 경우 다른 throw할 것이 필요
		findClass();
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2"); // ClassNotFoundException 발생
	}

}
