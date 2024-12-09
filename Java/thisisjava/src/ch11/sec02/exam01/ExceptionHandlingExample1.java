package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	// 문자 수를 가져오는 메소드
		public static void printLength(String data) {
			try {
				int result = data.length(); // date가 null이면 예외 발생
				System.out.println("문자 수: " + result);
			} catch(NullPointerException e) {  // NullPointerException발생시 해당 구문을 실행
				System.out.println(e.getMessage()); // 오류 일반 메시지1
//				System.out.println(e.toString()); // 오류 일반 메시지2
//				e.printStackTrace();   // 오류 상세 메시지
			} finally {
				System.out.println("[마무리 실행]\n");
			}
		}

		// 실행 메소드
		public static void main(String[] args) {
//			String a1 = null;
//			a1.length();  // null이라서 예외 발생
			
			System.out.println("[프로그램 시작]\n");
			printLength("ThisIsJava");  // 매개값으로 ThisIsJava 문자열 전달
			printLength(null);  		// 매개값으로 null 전달
			System.out.println("[프로그램 종료]");
			
		}

}
