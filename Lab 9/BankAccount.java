package Lab9;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public abstract class BankAccount {
	private String memberName, memberNID, accountNumber;
    private double accountBalance, minimumBalance;
    private ArrayList<Transaction> transactions;  //Multiple Transaction of a Account

    public BankAccount(String memberName, String memberNID, double accountBalance, double minimumBalance) {
        this.memberName = memberName;
        this.memberNID = memberNID;
        this.accountBalance = accountBalance;
        this.minimumBalance = minimumBalance;
        transactions = new ArrayList<>();

        Random rand = new Random();
        accountNumber = "" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10); //Generate Random Account Number.
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getMemberNID() {
        return memberNID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void deposit(double depAmount) {
        deposit(depAmount, "Deposit");
    }
    
    protected void deposit(double depAmount, String type) {
        accountBalance += depAmount;
        addTransaction(depAmount, type);
    }

    public void withdraw(double withAmount) {
        withdraw(withAmount, "Withdraw");
    }
    
    protected void withdraw(double withAmount, String transactionType) {
    	double newBalance = accountBalance - withAmount;
        if(newBalance >= minimumBalance) {
            accountBalance = newBalance;
            addTransaction(withAmount, transactionType);
        } else {
        	JOptionPane.showMessageDialog(null, "Not enough balance!");
        }
    }
    
    public void addTransaction(double amt, String type) {
    	Transaction t = new Transaction(amt, type);
    	transactions.add(t);
    }
    
    public ArrayList<Transaction> getTansactions() {
    	return transactions;
    }

    @Override
    public String toString() {
        return String.format("Type: %s  - Account Name: %s  -  Account Number: %s  -  Balance: %.2f  - Minimum Balance-Minimum Withdraw Balance: %.2f", getClass().getSimpleName(), memberName, accountNumber, accountBalance, minimumBalance);
    }
}
