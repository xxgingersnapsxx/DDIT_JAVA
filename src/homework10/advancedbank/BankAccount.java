package homework10.advancedbank;

public abstract class BankAccount {
	// 잔액: 최대 21억
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	// 입금
	public void deposit(int amount) {
		this.balance += amount;
	}
	// 출금
	public boolean withdraw(int amount) {
		this.balance -= amount;
		return true;
	}
	
	/**
	 * 현재 계좌에서 다른 계좌로 amount(금액)을 이체하는 메소드
	 * @param amount 이체 금액
	 * @param otherAccount 이체할 계좌번호
	 * @return 이체 성공시 true, 실패시 false
	 */
	public boolean transfer(int amount, BankAccount otherAccount) {
		if (amount < 0 && amount > balance) {
			throw new IllegalArgumentException();
		}
		if (otherAccount == null) {
			throw new NullPointerException();
		}
		withdraw(amount);
		otherAccount.deposit(amount);
		return true;
	}
	
	// 계좌의 종류를 반환하는 메소드
	public abstract String getAccountType();

	@Override
	public String toString() {
		return String.format("%,d", this.balance);
	}
	
}




