package homework7;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount account;
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@Override
	public String toString() {
		return String.format("이름: %s %s, 잔고: %,d원", firstName, lastName, account.getBalance());
	}
}







