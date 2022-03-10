package lab8;

public class SavingsAccount extends BankAccount {
	private double interest=0.05;
	private double maxWithAmmount;
	
	public SavingsAccount(String memberName, int memberNID, double accountBalance, double maxWithLimit) {
		super(memberName, memberNID, accountBalance, 2000);
		this.maxWithAmmount=maxWithLimit;
		
	}
	private double calculateInterest() {
		return getAccountBalance()*interest;
	}
	public double getNetBalance() {
		return getAccountBalance()+calculateInterest();
	}
	
	@Override
	public void withdraw(double bal) {
		super.withdraw(bal);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	public double getMaxWithAmmount() {
		return maxWithAmmount;
	}
	
	public double getInterestPercentage() {
		return interest;
	}
	public void getMaxWithAmmount(double ammount) {
		maxWithAmmount=ammount ;
	}
	
	public void getInterestPercentage(double per) {
		interest=per;
	}

}

