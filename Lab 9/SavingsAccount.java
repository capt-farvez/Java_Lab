package Lab9;

import javax.swing.JOptionPane;

public class SavingsAccount extends BankAccount {
	private double interest = 0.05;
    double maxWithLimit;

    public SavingsAccount(String memberName, String memberNID, double accountBalance, double maxWithLimit) {
        super(memberName, memberNID, accountBalance, 2000); 
        this.maxWithLimit = maxWithLimit;
    }
    
    protected SavingsAccount(String memberName, String memberNID, double accountBalance, double minumumBalance, double maxWithLimit) {
        super(memberName, memberNID, accountBalance, minumumBalance);
        this.maxWithLimit = maxWithLimit;
    }

    private double calculateInterest() {
        return getAccountBalance() * interest;
    }

    public double getNetBalance() {
        return getAccountBalance() + calculateInterest();
    }

    public double getMaxWithdrawLimit() {
        return maxWithLimit;
    }

    public void setMaxWithdrawLimit(double amount) {
        maxWithLimit = amount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double amount) {
        interest = amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount < maxWithLimit) {
            super.withdraw(amount);
        } else {
        	JOptionPane.showMessageDialog(null, "Maximum withdraw limit reached!");
        }
    }

    @Override
    public String toString() {
        return String.format("%s-%.2f", super.toString(), maxWithLimit);
    }
}

