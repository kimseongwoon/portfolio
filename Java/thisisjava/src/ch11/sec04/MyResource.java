package ch11.sec04;

public class MyResource implements AutoCloseable {
	private String name;
	
	public MyResource(String name) {
		this.name = name;
	}
	
	public String read1() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "100";  // 숫자 문자열
	}
	
	public String read2() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "abc";  // 문자 문자열
	}
	
	// try-with-resource에서는 아래 close메소드를 자동으로 호출
	@Override
	public void close() throws Exception {
		System.out.println("[MyResource(" + name + ") 닫기]");
	}

}
