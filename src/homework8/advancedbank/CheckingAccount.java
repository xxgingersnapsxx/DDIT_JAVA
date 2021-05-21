package homework8.advancedbank;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}
	
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	@Override
	public boolean withdraw(int amount) {
		// 예 계좌 잔액(this.balance) 50,000원
		// 출금 금액(amount) 80,000원
		// amount - this.balance => 차액을 연결된 SavingsAccount계좌에서 차감
		if (amount > this.balance) {
			protectedBy.balance -= amount - this.balance;
			this.balance = 0;
		} else {
			super.withdraw(amount);// this.balance -= amount;
		}
		return true;
	}

	@Override
	public String getAccountType() {
		return "당좌예금";
	}
}









