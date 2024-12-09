package ch11.sec06;

public class InsufficientExceptionExample {
	public static void main(String[] args) 
			throws Exception, RuntimeException, InsufficientException {
		//throw new Exception();
		//throw new RuntimeException();
		throw new InsufficientException();
	}

}
