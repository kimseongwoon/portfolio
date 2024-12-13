package ch05.sec09;

public class ArrayCopyByForExample {
	
	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};  //  길이가 3인 배열
		int[] newIntArray = new int[5]; // 길이 5인 배열이며 초기값은 0
		
		// for문을 이용한 배열 항목 값 복사
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		// 출력
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}

}
