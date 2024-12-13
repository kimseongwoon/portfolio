package ch12.exercise.problem5;

import java.util.HashSet;

public class StudentExample {
	
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		hashSet.add(new Student("1"));  // HashSet 클래스 공간에 Student 객체 저장
		hashSet.add(new Student("1"));  // HashSet 클래스 공간에 Student 객체 저장
		hashSet.add(new Student("2"));  // HashSet 클래스 공간에 Student 객체 저장
		
		System.out.println("저장된 Student 수: " + hashSet.size());
	}

}
