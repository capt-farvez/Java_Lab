package lab8;
import java.util.ArrayList;
public class Bank {
	ArrayList<BankAccount> accounts = new ArrayList<>();
	private void addAccount(BankAccount acc) {
		accounts.add(acc);
	}
	public void addAccount(String name, int mNID, double balance, String tradeLicense) {
		CurrentAccount acc = new CurrentAccount(name, mNID, balance, tradeLicense);
		addAccount(acc);
	}
	public void addAccount(String name, int mNid, double balance, double maxWithLimit) {
		SavingsAccount acc = new SavingsAccount(name, mNid, balance, maxWithLimit);
		addAccount(acc);
	}
	
	
	private BankAccount findAccount(String accountNumber) {
		for (int i =0 ; i<accounts.size(); i++) {
			BankAccount b= accounts.get(i);
			if(b.getAccountNumber().equals(accountNumber)) {
				return b;
			}
		}
		return null;
	}
	
	public void deposit(String accNum, double ammount) {
		BankAccount b = findAccount(accNum);
		if(b==null) {
			System.out.println("Account not found.");
		}
		else {
			b.deposit(ammount);
		}
	}
	
	public void withdraw(String accNum, double withAmmount) {
		BankAccount b = findAccount(accNum);
		if(b==null) {
			System.out.println("Account not Found.");
		}
		else {
			b.withdraw(withAmmount);
		}
	}
	
	public void transfer(String fromAccNum, String toAccNum, double amt) {
		BankAccount fromAcc=findAccount(fromAccNum);
		BankAccount toAcc= findAccount(toAccNum);
		if(fromAcc != null && toAcc != null) {
			fromAcc.withdraw(amt);
			toAcc.deposit(amt);
		}
		
		else {
			System.out.println("One or Both account not found.");
		}
	}
	
	public double getBalance(String accNum) {
		BankAccount acc=findAccount(accNum);
		
		if(acc!=null) {
			return acc.getAccountBalance();
		}
		return 0;
	}
	
	public String getAccountSummary(String accNum) {
		BankAccount acc= findAccount(accNum);
		if(acc==null) {
			return null;
		}
		return toString();
	}
	
	public String getListOfAccounts() {
		for(BankAccount b:accounts) {
			return b.toString();
		}
		return null;
	}
	
	

}
