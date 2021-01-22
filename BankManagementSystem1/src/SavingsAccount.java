import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SavingsAccount extends Account {

	private final double INTEREST_RATE = 6;
	AccountType accountType = AccountType.SAVINGS;
	private final static double MONTHLY_LIMIT = 50000.00;
	private final static double MINIMUM_BALANCE = 1000.00;
	private final static double DAILY_LIMIT = 10000.00;
	
	@Override
	public void createNewAccount(Branch branch) throws IOException {
		long min = 000000000;
		long max = 100000000;
		accountNumber = (int) (Math.random() * (max - min + 1) + min);
		
		try {
			InputStreamReader r=new InputStreamReader(System.in);    
		    BufferedReader br=new BufferedReader(r);
			System.out.println("Enter Balance: ");
			balance = Double.parseDouble(br.readLine());
			
			if(balance < MINIMUM_BALANCE) {
				throw new Exception("Opening balance is less than minimum balance required to open account");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void showAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Account Type: " + accountType);
	}

	public double getINTEREST_RATE() {
		return INTEREST_RATE;
	}

	public static double getMonthlyLimit() {
		return MONTHLY_LIMIT;
	}

	public static double getMinimumBalance() {
		return MINIMUM_BALANCE;
	}

	public static double getDailyLimit() {
		return DAILY_LIMIT;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}