package lab4;

public class BankAccount {
	
	public String name, accNum;
	public double balance;
	
	public BankAccount(String name, String accNum, double balance){
		this.name=name;
		this.accNum=accNum;
		this.balance= balance;
	}
	
	public void deposit(double depAmmount)
	{
		balance+=depAmmount;
	}
	
	public void withdraw(double withAmmount) {
		if(balance<withAmmount) {
			System.out.println(" Not Enough Balance !");
		}
		else {
			balance-=withAmmount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void display() {
		System.out.println(this);
	}
	
	public String toString() {
		return " Name : ["+name+"], AccNum : ["+accNum+"], Balance : ["+balance+"]  " ;
	}

}
