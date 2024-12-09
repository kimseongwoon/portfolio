package ch11.sec02.exam02;

import java.lang.String;
//import java.lang.String2;

public class ExceptionHandlingExample {
	public static void main(String args[]) {
		try {
			// java.lang.String클래스가 없다면 ClassNotFoundException이 발생 
			Class.forName("java.lang.String"); 
		} catch(ClassNotFoundException e) { // 클래스가 없는 경우	
			e.printStackTrace();
		}
		
		// 예외발생
		try {
			// java.lang.String2클래스가 없다면 ClassNotFoundException이 발생 
			Class.forName("java.lang.String2"); 
		} catch(ClassNotFoundException e) { // 클래스가 없는 경우	
			e.printStackTrace();  // 빨간색으로 나옴
		}
	}

}
