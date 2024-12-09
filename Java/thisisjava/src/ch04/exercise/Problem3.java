package ch04.exercise;

public class Problem3 {
	
	public static void main(String[] args) {
		// 3의 배수는 3으로 나누었을 때 나머지가 0이 되는 값
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		
		System.out.println("3의 배수의 합은 " + sum);
	}

}
