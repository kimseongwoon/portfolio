package ch12.exercise.problem12;

import java.util.Random;

public class IntergerCompareExample {
	
	public static void main(String[] args) {
		// 530page 참고
		Integer obj1 = 100;  // -128~127 범위이내
		Integer obj2 = 100;  // -128~127 범위이내
		Integer obj3 = 300;  // -128 ~ 127초과
		Integer obj4 = 300;  // -128 ~ 127초과

		System.out.println(obj1 == obj2); // true
		System.out.println(obj3 == obj4); // false
		
		System.out.println(obj1.equals(obj2)); // true
		System.out.println(obj3.equals(obj4)); // true
		
		Random r1 = new Random();
		System.out.println("nextInt() -> " + r1.nextInt()); // 0 <= ... <= 약21억정도
		System.out.println("nextInt(bound) -> " + r1.nextInt(20));  // 0 <= ... < bound
		
	}
	
}
