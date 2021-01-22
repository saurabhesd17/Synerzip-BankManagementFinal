import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.util.List;
import java.util.Map;

public class Branch implements Bank {
	private static int branchId = 0;
	private static String IFSC_CODE;
	private String branchName;
	private long branchNumber;
	private String branchCity;
	private String branchState;
	private String branchCountry;
	private String branchAddress;
	private int random;
	private final String BANK_NAME = "HDFC";
	
	public List<Account> accounts = new ArrayList<>();
	public Map<String, Customer> customers = new HashMap<>();

	public void createNewBranch() throws IOException {
		int min = 000000;
		int max = 100000;
		random = (int) (Math.random() * (max - min + 1) + min);
		IFSC_CODE = "HDFC" + String.valueOf(random);
		
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
		
	    System.out.println("Enter New Branch Name: ");
		branchName = br.readLine();
		System.out.println("Enter New Branch Address: ");
		branchAddress = br.readLine();
		System.out.println("Enter New Branch City: ");
		branchCity = br.readLine();
		System.out.println("Enter New Branch State: ");
		branchState = br.readLine();
		System.out.println("Enter New Branch Country: ");
		branchCountry = br.readLine();
		System.out.println("Enter New Branch Number: ");
		branchNumber = Long.parseLong(br.readLine());
		branchId++;
	}

	public void showBranchDetails() {
		System.out.println(IFSC_CODE);
		System.out.println(branchId);
		System.out.println(branchName);
		System.out.println(branchCity);
		System.out.println(branchState);
		System.out.println(branchCountry);
		System.out.println(branchAddress);
		System.out.println(branchNumber);
		System.out.println(BANK_NAME);
	}
	
	// showings all account in branch
	public void showAccounts() {
		for(Account account : accounts) {
			System.out.println("Account Number: " + account.getAccountNumber());
			System.out.println("IFSC-CODE: " + IFSC_CODE);
			System.out.println("Balance: " + account.getBalance());
		}
	}
	
	// showing all customers in branch
	public void showCustomers() {
		for(Map.Entry<String, Customer> map : customers.entrySet()) {
			String pan = map.getKey();
			Customer customer = map.getValue();
			
			System.out.println("Name: " + customer.getCustomerName());
			System.out.println("PANCARD: " + pan);
			System.out.println("Email: " + customer.getCustomerEmail());
			System.out.println("Phone Number: " + customer.getCustomerNumber());
			System.out.println("Address: " + customer.getCustomerAddress());
		}
	}
	
	public void showData(String panNumber) {
		boolean flag = false;
		for(Map.Entry<String, Customer> map : customers.entrySet()) {
			String pan = map.getKey();
			Customer customer = map.getValue();
			
			System.out.println("Name: " + customer.getCustomerName());
			System.out.println("PANCARD: " + pan);
			System.out.println("Email: " + customer.getCustomerEmail());
			System.out.println("Phone Number: " + customer.getCustomerNumber());
			System.out.println("Address: " + customer.getCustomerAddress());
		}
		if(flag == false) {
			System.out.println("Your entered PANCARD number didn't match with any of the accounts");
		}
	}

	public static int getBranchId() {
		return branchId;
	}

	public static void setBranchId(int branchId) {
		Branch.branchId = branchId;
	}

	public long getBranchNumber() {
		return branchNumber;
	}

	public String getBranchName() {
		return branchName;
	}

	public String getBranchCity() {
		return branchCity;
	}

	public String getBranchState() {
		return branchState;
	}

	public String getBranchCountry() {
		return branchCountry;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchNumber(int branchNumber) {
		this.branchNumber = branchNumber;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}

	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}

	public void setBranchCountry(String branchCountry) {
		this.branchCountry = branchCountry;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public static String getIFSC_CODE() {
		return IFSC_CODE;
	}

	public String getBankName() {
		return BANK_NAME;
	}

	public void setIFSC_CODE(String iFSC_CODE) {
		IFSC_CODE = iFSC_CODE;
	}

}