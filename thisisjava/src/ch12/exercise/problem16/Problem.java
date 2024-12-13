package ch12.exercise.problem16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Problem {
	public static void main(String[] args) {
		Date now = new Date();
        SimpleDateFormat df 
        	= new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        System.out.println(df.format(now));
	}

}
