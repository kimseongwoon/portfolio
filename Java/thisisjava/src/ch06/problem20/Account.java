package ch06.problem20;

public class Account {
	private String ano;  // 계좌번호
	private String amn;  // 계좌주
	private int balance; // 남아있는 금액
	
	public Account(
			String ano, 
			String amn,
			int balance
	) {
		this.ano = ano;
		this.amn = amn;
		this.balance = balance;
	}	
	
	public String getAno() {
		return this.ano;
	}
	public String getAmn() {
		return this.amn;
	}
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		this.balance += balance;
	}
	
}