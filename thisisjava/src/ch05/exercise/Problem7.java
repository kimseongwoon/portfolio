package ch05.exercise;

public class Problem7 {
	
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		
		System.out.println("최대값: " + getMaxValueFromIntArray(array));
	}
	
	// 최대값을 구하는 함수 만들기
	private static int getMaxValueFromIntArray(int[] generalArray) {
		// array의 최대값 구하기(for문과 array.length 사용)
		int max = 0;
		for(int i = 0; i < generalArray.length; i++) {
			if (max < generalArray[i])		// 기존 최대값이 새로운 array[i]의 값보다 작은 경우는 max값을 대체
				max = generalArray[i];
		}
		
		return max;
	}

}
