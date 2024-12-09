package ch12.sec05;

import java.util.*;

public class StringTokenizerExmaple {
	public static void main(String[] args) {
		// token -> ex) 나는 학교에 간다. token -> 나는, 학교에, 간다.
		String data1 = "홍길동&이수홍&박연수";
		String[] arr = data1.split("&");  // arr[0] -> 홍길동, arr[1] -> 이수홍, arr[2] -> 박연수
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		StringTokenizer st = new StringTokenizer("this is a test");
	    while (st.hasMoreTokens()) {		// 빈 토큰이 있을 때까지
	        System.out.println(st.nextToken());	// token 1개씩 가져오는 메소드
	    }
	    
	    String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st2 = new StringTokenizer(data2, "/");
		while (st2.hasMoreTokens()) {
			String token = st2.nextToken();
			System.out.println(token);
		}
	}

}
