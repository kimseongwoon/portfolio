package ch11.sec03.exam01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "1oo"};

		for(int i=0; i <= array.length; i++) {
			try {
				// array[0] -> 100 -> 에러가 아님
				// array[1] -> 1oo -> NumberFormatException 예외발생 
				// array[2] -> ArrayIndexOutOfBoundsException 발생
				// 1. ArrayIndexOutOfBoundsException와 2. NumberFormatException이 발생 가능성이 있는 코드
				int value = Integer.parseInt(array[i]);  
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			}
			// finally 블록 생략 가능
		}
	}

}
