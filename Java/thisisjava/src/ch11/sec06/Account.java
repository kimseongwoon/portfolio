package ch11.sec06;

public class Account {
	private long balance;
	
	public Account() {}
	/**
	 * 잔액 가져오기
	 * @return
	 */
	public long getBalance() {
		return balance;
	}
	
	/**
	 * 예금하기
	 * @param money
	 */
	public void deposit(int money) {
		balance += money;
	}
	
	/**
	 * 인출하기
	 * @param money
	 * @throws InsufficientException
	 */
	public void withdraw(int money) throws InsufficientException {
		if(balance < money) {
			throw new InsufficientException("잔고 부족: " + (money-balance) + " 모자람");
		}
		balance -= money;
	}

}
