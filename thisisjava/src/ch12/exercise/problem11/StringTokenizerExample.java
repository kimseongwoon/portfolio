package ch12.exercise.problem11;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		// 1. String의 split이용
		String[] strArr = str.split(",");
		for(String s : strArr) {
			System.out.println(s);
		}

		// 2. StringTokenizer를 이용
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
