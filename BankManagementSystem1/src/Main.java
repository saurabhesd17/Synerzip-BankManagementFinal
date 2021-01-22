import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Branch branch  = new Branch();
		branch.createNewBranch();
//		branch.showBranchDetails();
	
		Operations.showMenu(branch);
	}

}