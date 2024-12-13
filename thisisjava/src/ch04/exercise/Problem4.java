package ch04.exercise;

public class Problem4 {
	
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random() * 6) + 1;   // 주사위 1
			int num2 = (int)(Math.random() * 6) + 1;   // 주사위 2
			
			System.out.println("num1: " + num1 + ", num2: " + num2);
			if(num1 + num2 == 5) {
				break;
			}
		}

	}

}
