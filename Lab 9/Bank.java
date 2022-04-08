package Lab9;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Bank {
	private ArrayList<BankAccount> accounts;
	private String bankName;

    public Bank(String name) {
        accounts = new ArrayList<>();
        bankName = name;
    }
    
    public ArrayList<BankAccount> getAccounts() {
    	return accounts;
    }

    private void addAccount(BankAccount acc) {
        accounts.add(acc);
    }

    public void addAccount(String name, String mNid, double balance, double maxWithLimit) {
        SavingsAccount acc = new  SavingsAccount(name, mNid, balance, maxWithLimit);
        addAccount(acc);
    }

    public void addAccount(String name, String mNid, double balance, String tradeLicense) {
        CurrentAccount acc = new CurrentAccount(name, mNid, balance, tradeLicense);
        addAccount(acc);
    }
    
    public void addAccount(String memberName, String memberNid, String sid, String insName, double accountBalance) {
    	StudentAccount acc = new StudentAccount(memberName, memberNid, sid, insName, accountBalance);
    	addAccount(acc);
    }

    private BankAccount findAccount(String accountNum) {
        for(BankAccount acc : accounts) {
            if(acc.getAccountNumber().equals(accountNum)) {
                return acc;
            }
        }

        return null;
    }

    public void deposit(String accountNum, double amt) {
        BankAccount acc = findAccount(accountNum);

        if(acc == null) {
            JOptionPane.showMessageDialog(null, "Account not found!");
            return;
        }

        acc.deposit(amt);
    }

    public void withdraw(String accountNum, double amt) {
        BankAccount acc = findAccount(accountNum);

        if(acc == null) {
            JOptionPane.showMessageDialog(null, "Account not found!");
            return;
        }

        acc.withdraw(amt);
    }

    public void transfer(String fromAccNum, String toAccNum, double amt) {
        BankAccount fromAcc = findAccount(fromAccNum);
        BankAccount toAcc = findAccount(toAccNum);

        if(fromAcc == null || toAcc == null) {
            JOptionPane.showMessageDialog(null, "Account not found!");
            return;
        }

        fromAcc.withdraw(amt);
        toAcc.deposit(amt);
    }

    public double getBalance(String accountNum) {
        BankAccount acc = findAccount(accountNum);

        if(acc == null) {
            JOptionPane.showMessageDialog(null, "Account not found!");
            return 0;
        }

        if(acc instanceof CurrentAccount) {
            return acc.getAccountBalance();
        } else {
            return ((SavingsAccount)acc).getNetBalance();
        }
    }
    
    public ArrayList<BankAccount> getAccounts(String type) {
    	ArrayList<BankAccount> list = new ArrayList<>();
    	for(BankAccount acc : accounts) {
    		if(acc.getClass().getSimpleName().equals(type)) {
    			list.add(acc);
    		}
    	}
    	
    	return list;
    }
    
    public ArrayList<Transaction> getAccTransactions(String accountNum) {
    	BankAccount acc = findAccount(accountNum);

        if(acc == null) {
            JOptionPane.showMessageDialog(null, "Account not found!");
           return new ArrayList<>();
        }
        
        return acc.getTansactions();
    }
    
    public ArrayList<BankAccount> findAccounts(String memberNID) {
    	ArrayList<BankAccount> list = new ArrayList<>();
    	for(BankAccount acc : accounts) {
    		if(acc.getMemberNID().equals(memberNID)) {
    			list.add(acc);
    		}
    	}
    	
    	return list;
    }
    
    public BankAccount findAccount(String memberNid, String accountNumber) {
    	return findAccount(accountNumber);
    }
    
    ArrayList<Transaction> getAccTransactions(String memberNid, String accountNum) {
    	BankAccount acc = findAccount(memberNid, accountNum);

        if(acc == null || !acc.getMemberNID().equals(memberNid)) {
            JOptionPane.showMessageDialog(null, "Account not found!");
           return new ArrayList<>();
        }
        
        return acc.getTansactions();
    }

    public String getAccountSummary(String accountNum) {
        BankAccount acc = findAccount(accountNum);

        if(acc == null) {
            JOptionPane.showMessageDialog(null, "Account not found!");
            return "";
        }

        return acc.toString();
    }

    public String getListOfAccounts() {
        StringBuilder str = new StringBuilder();
        for(BankAccount acc : accounts) {
            str.append(acc);
            str.append('\n');
        }

        return str.toString();
    }
}
