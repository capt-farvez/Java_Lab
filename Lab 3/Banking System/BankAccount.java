public class BankAccount {
	
	public String name;
	public String id;
	public double balance;
	
	public void deposit(double depAmmount) {
		balance = balance + depAmmount;
	}
	
	public void withdraw(double withAmmount) {
		balance = balance - withAmmount;
	}
	
	public double getBalance() {
		return balance;
	}
	public void display() {
		System.out.printf("Name:[%s]; Id:[%s]; Balance:[%.2f] \n ",name, id, balance);

	}
}