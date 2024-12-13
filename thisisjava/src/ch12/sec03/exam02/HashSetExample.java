package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1);  // HashSet 클래스 공간에 Student 객체 저장
		System.out.println("저장된 객체 수: " + hashSet.size()); // 1
		
		Student s2 = new Student(1, "홍길동");
		// s1의 hashCode와 s2의 hashCode값이 같고 equals의 return값이 true이기 때문
		hashSet.add(s2);  // HashSet 클래스 공간에 Student 객체 저장 실패. 	
		System.out.println("저장된 객체 수: " + hashSet.size()); // 1? 2? -> 1
		
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);  // HashSet 클래스 공간에 Student 객체 저장
		System.out.println("저장된 객체 수: " + hashSet.size()); // 2
		
		System.out.println("s3가 찍히는 값은 " + s3);
	}

}
