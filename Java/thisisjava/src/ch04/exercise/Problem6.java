package ch04.exercise;

import java.util.Scanner;

public class Problem6 {
	
	public static void main(String[] args) {
//		for(int i = 1; i <= 8; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//				if (j == i)  // 각 라인마다 끝의 열에 도달한다면
//					System.out.println(); // 한 줄 띄우기
//			}
//		}
		
		// 크리스마스 트리 만들기
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.print(" ");
			
			for (int j = 0; j < (2 * i - 1); j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	
}
