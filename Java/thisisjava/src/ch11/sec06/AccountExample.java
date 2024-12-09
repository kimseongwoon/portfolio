package ch11.sec06;

public class AccountExample {
	
	public static void main(String[] args) {
		Account account = new Account();
		
		try {
			account.withdraw(30000);
		} catch(InsufficientException e) {  // 사용자 정의 예외 클래스 호출됨
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
