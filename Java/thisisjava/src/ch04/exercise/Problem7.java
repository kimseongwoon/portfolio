package ch04.exercise;

import java.util.Scanner;

public class Problem7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 계좌잔액 -> balance
		int balance = 0;

		boolean run = true;
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");

			int menuNumber = Integer.parseInt(scanner.nextLine());
			switch(menuNumber) {
			case 1:		// 1. 예금
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:		// 2. 출금
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:		// 3. 잔고
				System.out.println("잔고> " + balance);
				break;
			case 4:		// 4. 종료
				run = false;
				break;
			}
			
			System.out.println();
		}
		System.out.println("프로그램 종료");
		
	}

}
