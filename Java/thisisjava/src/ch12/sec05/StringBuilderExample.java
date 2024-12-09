package ch12.sec05;

public class StringBuilderExample {
	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")			// 문자열을 끝에 create
				.insert(0, "ABC")	    // 문자열을 지정한 index에 create
				.delete(3, 4)			// 지정한 index range로 delete
				.toString();			// 문자열을 read(select)
		System.out.println(data);
	}

}
