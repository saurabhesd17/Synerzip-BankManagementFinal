import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
	private static int customerId = 100;
	private String panNumber;
	private String name;
	private long accountNumber;
	private long phoneNumber;
	private String address;
	private String email;

	private Account account;

	public void createNewCustomer(Branch branch) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    System.out.println("Enter Customer Name: ");
		name = br.readLine();
		System.out.println("Enter your PANCARD number: ");
		panNumber = br.readLine();
		System.out.println("Enter Customer Email: ");
		email = br.readLine();
		System.out.println("Enter Customer Address: ");
		address = br.readLine();
		System.out.println("Enter Customer Number: ");
		phoneNumber = Long.parseLong(br.readLine());
		System.out.println("What type of account you want to create?");
		System.out.println("1.Savings");
		System.out.println("2.Current");

		int accountChoice = Integer.parseInt(br.readLine());
		boolean condition = true;
		while (condition) {
			switch (accountChoice) {
			case 1:
				account = new SavingsAccount();
				account.createNewAccount(branch);
				branch.accounts.add(account);
				condition = false;
				break;
			case 2:
				account = new CurrentAccount();
				account.createNewAccount(branch);
				branch.accounts.add(account);
				condition = false;
				break;
			default:
				System.out.print("oops wrong choice try again");
				break;
			}
		}
		customerId++;
	}

	public void showCustomerData() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Customer Name: " + name);
		System.out.println("Pan Card: " + panNumber);
		System.out.println("Customer Email: " + email);
		System.out.println("Customer Address: " + address);
		System.out.println("Customer Number: " + phoneNumber);
	}

	public static int getCustomerId() {
		return customerId;
	}

	public long getCustomerNumber() {
		return phoneNumber;
	}

	public String getCustomerName() {
		return name;
	}

	public String getCustomerAddress() {
		return address;
	}

	public String getCustomerEmail() {
		return email;
	}

	public static void setCustomerId(int customerId) {
		Customer.customerId = customerId;
	}

	public void setCustomerNumber(long customerNumber) {
		this.phoneNumber = customerNumber;
	}

	public void setCustomerName(String customerName) {
		this.name = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.address = customerAddress;
	}

	public void setCustomerEmail(String customerEmail) {
		this.email = customerEmail;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

}