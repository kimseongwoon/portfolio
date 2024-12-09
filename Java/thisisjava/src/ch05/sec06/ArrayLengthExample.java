package ch05.sec06;

public class ArrayLengthExample {
	
	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		int[] scores = { 83, 90, 87 };

		// scores.length = 4;  // error
		//총합과 평균 구하기
		int sum = 0;
		for(int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
