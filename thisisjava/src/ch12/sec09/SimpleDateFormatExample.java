package ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		// 현재 시간을 밀리초 단위로 가져오기
		long timeMillis = System.currentTimeMillis();
		System.out.println("현재시간(currentTimeMillis)은 " + timeMillis); // 많이 사용
		
		// Date 객체로 변환
        Date currentDate = new Date(timeMillis);
        
        // SimpleDateFormat으로 원하는 포맷 지정
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        // 포맷에 맞게 현재 시간 출력
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("현재 시간(년-월-일 시:분:초) " + formattedDate);
        
        //////////////////////////////////////////////////////////////////
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println( sdf.format(now) );

		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println( sdf.format(now) );

		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println( sdf.format(now) );

		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println( sdf.format(now) );

		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println( sdf.format(now) );

		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println( sdf.format(now) );
	}

}
