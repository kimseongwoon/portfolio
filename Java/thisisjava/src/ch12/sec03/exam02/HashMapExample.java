package ch12.sec03.exam02;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		
		Student s1 = new Student(1, "홍길동0");
		hashMap.put(1, s1); // key가 1이고 value가 s1
		System.out.println("저장된 객체 수: " + hashMap.size()); // 1
		
		Student s2 = new Student(1, "홍길동1");
		hashMap.put(1, s2);  // key가 1이고 value가 s2 -> 교체가 됨	
		System.out.println("저장된 객체 수: " + hashMap.size()); // 1? 2? -> 1
		
		Student s3 = new Student(2, "홍길동2");
		hashMap.put(2, s3);  // key가 2이고 value가 s3
		System.out.println("저장된 객체 수: " + hashMap.size()); // 2
	}

}
