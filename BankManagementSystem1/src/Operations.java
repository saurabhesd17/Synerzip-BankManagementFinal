import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operations {
	public static void showMenu(Branch branch) throws IOException {
		boolean condition = true;
		InputStreamReader r=new InputStreamReader(System.in);    
		BufferedReader br=new BufferedReader(r);
		
		while (condition) {
			System.out.println("Press key for:");
			System.out.println("1.Branch");
			System.out.println("2.Customer");
			System.out.println("3.To exit press any key");

			int choice = Integer.parseInt(br.readLine());

			switch (choice) {
			case 1:
				System.out.println("1.Show Branch Details");
				System.out.println("2.Show accounts in branch");
				System.out.println("3.Show customers in branch");
				System.out.println("4.Press any key to go back to previous menu");
				int branchChoice = Integer.parseInt(br.readLine());

				switch (branchChoice) {
				case 1:
					branch.showBranchDetails();
					break;
				case 2:
					branch.showAccounts();
					break;
				case 3:
					branch.showCustomers();
					break;
				default:
					System.out.println("oops wrong choice try again.");
					break;
				}
				break;

			case 2:
				System.out.println("1.Create New Customer");
				System.out.println("2.Show Customer Details");
				System.out.println("3.Press any key to go to previous menu");
				int customerChoice = Integer.parseInt(br.readLine());

				switch (customerChoice) {
				case 1:
					Customer customer = new Customer();
					customer.createNewCustomer(branch);
					branch.customers.put(customer.getPanNumber(), customer);
					break;

				case 2:
					System.out.println("Enter your PANCARD number: ");
					String panNumber = br.readLine();
					branch.showData(panNumber);
					break;
				default:
					System.out.println("oops wrong choice");
					break;
				}
				break;

			default:
				System.out.println("Have a Nice day :)");
				condition = false;
				break;
			}
		}
	}
}