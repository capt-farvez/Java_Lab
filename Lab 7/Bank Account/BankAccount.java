package lab7;
import java.util.Random;

public class BankAccount {
	private String memberName ;
	private String accountNumber;
	private double accountBalance;
	
	public BankAccount (String memberName, double accountBalance) {
		this.memberName = memberName;
		this.accountBalance = accountBalance;
		Random rand = new Random();
		this.accountNumber = "" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+
				rand.nextInt(10)+ rand.nextInt(10);
	}
	
	public void deposit(double depAmmount) {
		accountBalance+=depAmmount;
	}
	
	public void withdraw(double withAmmount) {
		if(accountBalance<withAmmount) {
			System.out.println("Not Enough Balance. ");
		}
		else {
			accountBalance-=withAmmount;
		}
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return accountBalance;
	}
	
	public void display() {
		System.out.println(this);
	}
	
	public String toString() {
		return " Name : ["+memberName+"], Account Number : ["+accountNumber+"], Balance : ["+accountBalance+"]  " ;
	}
	
}
