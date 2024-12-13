package ch12.exercise.problem15;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Problem {
	public static void main(String[] args) {
		LocalDateTime nowDateTime = LocalDateTime.now();
		LocalDateTime endDateTime 
			= LocalDateTime.of(nowDateTime.getYear(), 12, 31, 0, 0, 0);
		
		// endDateTime에서 현재시간까지 남아있는 일수 값을 리턴
		long remainDay = nowDateTime.until(endDateTime, ChronoUnit.DAYS);
		System.out.println("남은 일자: " + remainDay);
	}

}
