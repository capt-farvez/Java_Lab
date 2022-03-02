package lab7;
import java.util.ArrayList;

public class Bank {
	String bankName;
	ArrayList<BankAccount> accounts = new ArrayList<> (); 
	
	public Bank(String bankName) {
		this.bankName= bankName;
	}
	
	private void addAccount(BankAccount acc) {
		accounts.add(acc);
		
	}
	
	public void addAccount(String name, double balance) {
		BankAccount accnt = new BankAccount(name, balance);
		accounts.add(accnt);
		
	}

	private BankAccount findAccount(String accountNumber) {
		for(int i=0; i<accounts.size(); i++) {
			BankAccount b = accounts.get(i);
			if (b.getAccountNumber().equals(accountNumber)) {
				return b;
			}
			
		}
		return null;
	}
	
	public void deposit(String accountNumber, double depAmmount) {
		BankAccount b= findAccount(accountNumber);
		if(b==null) {
			System.out.println("Account not found.");
		}
		
		else {
			b.deposit(depAmmount);
		}
		
	}
	
	public void withdraw(String accountNumber, double withAmmount) {
		BankAccount b = findAccount(accountNumber);
		if(b==null) {
			System.out.println("Account not found. ");
		}
		else {
			if(b.getBalance()<withAmmount) {
				System.out.println("Not enough Balance..");
			}
			else {
				b.withdraw(withAmmount);
			}
		}
		
	}
	//Display Specific account
	public void display(String accountNumber) {
		BankAccount b = findAccount(accountNumber);
		if (b==null) {
			System.out.println("Account not Found..");
		}
		else {
			b.display();
		}
	}
	//Display all account
	public void display() {
		for(BankAccount b: accounts ) {
			System.out.println(b);
		}
	}
	
	

}
