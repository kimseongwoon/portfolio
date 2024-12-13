package ch02.sec01;

public class VariableUseExample {
	
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");

		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
		long var3 = 1000L;   // long타입일 경우 숫자 뒤에 'L'넣어야 함
	}

}
