package ch04.exercise;

public class Problem5 {
	
	public static void main(String[] args) {
		// x, y는 10이하의 자연수 -> 0 
		for (int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y ++ ) {
				// 아래의 조건으로 해를 구해 출력
				if(((4 * x) + (y * 5)) == 60) {
					System.out.println("x: " + x + ", y: " + y);
				}		
			}
		}
	}

}
