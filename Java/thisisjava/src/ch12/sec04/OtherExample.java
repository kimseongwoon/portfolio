package ch12.sec04;

public class OtherExample {
	
	public static void main(String[] args) {
		long currTime1 = System.currentTimeMillis();
		long currTime2 = System.nanoTime();
		
		System.out.println("현재시간(currentTimeMillis)은 " + currTime1); // 많이 사용
		System.out.println("현재시간(nanoTime)은 " + currTime2);
		
		System.exit(0);  // 프로그램 강제로 종료(리턴값은 필요없음)
	}

}
