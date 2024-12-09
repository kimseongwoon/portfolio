package ch02.exercise;

public class Problem5 {
	
	public static void main(String[] args) {
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue = charValue;
		//short shortValue = charValue; // charValue는 문자이기 때문에 숫자로 강제 변환은 안됨.
		short shortValue = (short)charValue; // charValue는 문자이기 때문에 숫자로 강제 변환은 안됨.
		
	}

}
