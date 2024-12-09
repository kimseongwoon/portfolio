package ch05.sec12;

import java.util.Calendar;
import java.util.Scanner;

public class EnumExample {
	
	public static void main(String[] args) {
		Week today = Week.WEDNESDAY;
		int a = 0;
		Week yesterday = Week.TUESDAY;
		Week b = null; // 참조 타입이므로 null로 대입이 가능
		
		if (today == Week.WEDNESDAY) { // true
			System.out.println("오늘은 수요일입니다.");
		}
		
		// 현재 년-월-일 시:분:초 를 출력
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR); // 연도 가져오기
		System.out.println("현재연도: " + year);
		
		int month = now.get(Calendar.MONTH) + 1; // 월 가져오기 (0 ~ 11) 0: 1월, 1: 2월, ..., 11: 12월
		System.out.println("현재월: " + month);
		
		int day = now.get(Calendar.DAY_OF_MONTH); // 일 가져오기
		System.out.println("현재일: " + day);
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일 가져오기(숫자(1: 일요일, 2: 월요일, ..., 7: 토요일))
		System.out.println("현재주: " + week);
		
		int hour = now.get(Calendar.HOUR); // 시간
		System.out.println("현재시간: " + hour);
		
		int minute = now.get(Calendar.MINUTE); // 분 
		System.out.println("현재분: " + minute);
		
		int second = now.get(Calendar.SECOND); // 초
		System.out.println("현재초: " + second);
				
	}

}
