package ch05.sec07;

public class DimensionExample1 {
	
	public static void main(String[] args) {
		// 다차원 배열(2, 3차원 등등)
		int[][] scores = {
			{80, 90, 96},		// 1차원 배열의 0인덱스
			{76, 88}			// 1차원 배열의 1인덱스
		};
		int[][] scores2 = {{80, 90, 96},{76, 88}};
		
		int oneScore = scores[0][2];   // 96
	    int twoScore = scores[1][1];   // 88
	    
	    System.out.println("oneScore: " + oneScore);
	    System.out.println("twoScore: " + twoScore);
	    
	    // 다차원 배열 length사용하기
	    System.out.println("scores.length: " + scores.length);  // 2
	    System.out.println("scores[0].length: " + scores[0].length);  // 3
	    System.out.println("scores[1].length: " + scores[1].length);  // 2
	    
	    int[][] scores3 = new int[2][];
	    scores3[0] = new int[3];
		scores3[1] = new int[2];
	}

}
