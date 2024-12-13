package ch03.exercise;

public class Problem4 {

	public static void main(String[] args) {
		int value = 356;
		
		// 십의 자리 이하를 버리는 코드(산술 연산자만 사용) -> 300
		int floorValue = value / 100;  // 3
		int finalValue = floorValue * 100;  // 300
		
		System.out.println(finalValue);
		System.out.println((value / 100) * 100); // 300
	}

}
