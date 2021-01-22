import java.io.IOException;

public abstract class Account {
	protected long accountNumber;
	protected double balance;
	protected AccountStatus status = AccountStatus.ACTIVE;

	abstract public void createNewAccount(Branch branch) throws IOException;
	abstract public void showAccountDetails(); 

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}