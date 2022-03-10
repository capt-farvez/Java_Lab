package lab8;
import java.util.Random;
public class BankAccount {
	private String memberName;
	private int memberNID;
	private String accountNumber;
	private double accountBalance;
	private double minimumBalance;
	
	public BankAccount(String name, int nid, double accBalance, double miniBalance) {
		this.memberName= name;
		this.memberNID= nid;
		this.accountBalance= accBalance;
		this.minimumBalance=miniBalance;
		Random rand = new Random();
		this.accountNumber = "" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+ rand.nextInt(10)+ rand.nextInt(10);
		}
	
	public void deposit (double depAmmount) {
		accountBalance+=depAmmount;
	}
	public void withdraw(double withAmmount) {
		if(withAmmount>(accountBalance-minimumBalance)) {
			System.out.println("Not enough Balance.");
		}
		else {
			accountBalance-=withAmmount;
		}
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public String toString() {
		return " Name :"+memberName+", Account Number : "+accountNumber+" , Balance : "+accountBalance+" , Minimum Balance : "+minimumBalance+" ";
	}
}

