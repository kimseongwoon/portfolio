package ch02.sec13;         // c#에서는 package가 namespace 이다

import java.util.Scanner;   // Scanner를 사용할 수 있도록 해주는 기능(import와 비교되는 C#코드는 using)

public class ScannerExample {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   // C#에서는 Console.ReadKey()
		
		System.out.println("키보드를 아무거나 입력하고 엔터를 누르세요.");
		String str1 = scanner.nextLine();           // 키보드 입력 대기상태
		System.out.println("당신이 입력한 값은 '" + str1 + "'");
		
		// 더하기만 가능한 콘솔 계산기 프로그램
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);

		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);

		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();					// 한 줄 띄우기

		while(true) {
			System.out.print("입력 문자열(q 종료): ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}

		System.out.println("종료");
	}
}

