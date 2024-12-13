package ch11.exercise.problem8;

public class FileWriter implements AutoCloseable {
	
	public FileWriter(String fileName) {
		
	}
	
	public void write(String data) {
		
	}
	// try-with-resource에서는 아래 close메소드를 자동으로 호출
	@Override
	public void close() throws Exception {
		System.out.println("[닫기]");
	}

}
