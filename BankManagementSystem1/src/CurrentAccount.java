import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CurrentAccount extends Account {
	
	private AccountType accountType = AccountType.CURRENT;

	@Override
	public void createNewAccount(Branch branch) throws IOException {
		long min = 000000000;
		long max = 100000000;
		accountNumber = (int) (Math.random() * (max - min + 1) + min);
		
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
		System.out.println("Enter Balance: ");
		balance = Double.parseDouble(br.readLine());
	}

	@Override
	public void showAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Account Type: " + accountType);
	}

}