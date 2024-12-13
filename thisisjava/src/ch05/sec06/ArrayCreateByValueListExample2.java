package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	
	public static void main(String[] args) {
		// 배열 변수 선언
		int[] scores;
		// 배열 변수에 배열값을 대입
		scores = new int[] { 83, 90, 87 };
		// 총합과 평균 구하기
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		// 함수 혹은 메소드 호출. 배열을 매개값으로 전달
		fn1(new int[] {83, 90, 87});
		fn1(new int[] {83, 90, 87});
		fn1(new int[] {83, 90, 87});
		fn1(new int[] {83, 90, 87});
	}
	
	// printItem() 메소드 생성
	public static void fn1(int[] scores) {
		for(int i = 0; i < 3; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
	}

}
