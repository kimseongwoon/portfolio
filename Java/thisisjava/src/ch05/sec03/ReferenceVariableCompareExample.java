package ch05.sec03;

public class ReferenceVariableCompareExample {
	
	public static void main(String[] args) {
		int[] arr1; // 배열 변수 arr1 선언 
		int[] arr2; // 배열 변수 arr2 선언
		int[] arr3; // 배열 변수 arr3 선언
		
		arr1 = new int[] {1, 2, 3}; //배열 { 1, 2, 3 }을 생성하고 arr1 변수에 대입
		arr2 = new int[] {1, 2, 3}; //배열 { 1, 2, 3 }을 생성하고 arr2 변수에 대입
		arr3 = arr2;  // arr2의 주소번지를 arr3에 저장
		
		boolean isEqual1 = (arr1 == arr2);  // false
		boolean isEqual2 = (arr2 == arr3);  // true
		
		System.out.println(isEqual1);
		System.out.println(isEqual2);
	}

}
