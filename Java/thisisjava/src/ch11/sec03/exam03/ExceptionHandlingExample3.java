package ch11.sec03.exam03;

public class ExceptionHandlingExample3 {
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
			} catch(NullPointerException | NumberFormatException e) {
				System.out.println("실행에 문제가 있습니다. " + e.getMessage());
			}
			// finally 블록 생략 가능
		}
	}

}
