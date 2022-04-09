import Lab9_Banking_System;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BankApp {
	public static void main(String[] args) {
		Bank bankName = new Bank("ABCD Bank");
        int input;
        input = Integer.parseInt(JOptionPane.showInputDialog(null, "Login Option:\n 1. login as an employee. \n 2. login as a customer/account holder."));
        if (input == 1) {
        	String employeeId = JOptionPane.showInputDialog(null, "Please, Enter your employee id");
            do {
                input = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu:\n1. Create a new account\n2. Deposit money\n3. Withdraw money\n4. Transfer money\n5. Summary of an Account\n6. Display transactions info\n7. List of accounts of a type\n8. Display the list of all accounts\n0. Exit\n\n Enter your choice:"));
                switch (input) {
                    case 1: {
                        int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account type: \n1. Savings \n2. Current\n3. Student"));
                        String name = JOptionPane.showInputDialog(null, "Account Name");
                        String mNid = JOptionPane.showInputDialog(null, "NID number: ");
                        double balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Account Balance"));
                        if(type == 1) {
                            double maxWithLimit = Double.parseDouble(JOptionPane.showInputDialog(null, "Max Withdrawal Limit:"));
                            bank.addAccount(name, mNid, balance, maxWithLimit);
                        } else if(type == 3) {
                        	String sid = JOptionPane.showInputDialog(null, "Student ID");
                        	String sname = JOptionPane.showInputDialog(null, "School Name");
                            bank.addAccount(name, mNid, sid, sname, balance);
                        } else {
                            String tradeLicense = JOptionPane.showInputDialog(null, "Trade License");
                            bank.addAccount(name, mNid, balance, tradeLicense);
                        }
                        break;
                    }
                    case 2: {
                        String accNum = JOptionPane.showInputDialog(null, "Account Number");
                        double balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Deposit Amount"));
                        bank.deposit(accNum, balance);
                        break;
                    }
                    case 3: {
                        String accNum = JOptionPane.showInputDialog(null, "Account Number");
                        double balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Withdrawal Amount"));
                        bank.withdraw(accNum, balance);
                        break;
                    }
                    case 4: {
                        String accFrom = JOptionPane.showInputDialog(null, "From Account Number");
                        String accTo = JOptionPane.showInputDialog(null, "To Account Number");
                        double amt = Double.parseDouble(JOptionPane.showInputDialog(null, "Transfer Amount"));
                        bank.transfer(accFrom, accTo, amt);
                        break;
                    }
                    case 5: {
                        String accNum = JOptionPane.showInputDialog(null, "Account Number");
                        String des = bank.getAccountSummary(accNum);
                        JOptionPane.showMessageDialog(null, des);
                        break;
                    }
                    case 6: {
                        String accNum = JOptionPane.showInputDialog(null, "Account Number");
                        ArrayList<Transaction> trns = bank.getAccTransactions(accNum);
                        StringBuilder s = new StringBuilder();
                        for(Transaction t : trns) {
                        	s.append(t);
                        	s.append('\n');
                        }
                        JOptionPane.showMessageDialog(null, s.toString());
                        break;
                    }
                    case 7: {
                        String accType = JOptionPane.showInputDialog(null, "Account Type");
                        ArrayList<BankAccount> accs = bank.getAccounts(accType);
                        StringBuilder s = new StringBuilder();
                        for(BankAccount acc : accs) {
                        	s.append(accs);
                        	s.append('\n');
                        }
                        JOptionPane.showMessageDialog(null, s.toString());
                        break;
                    }
                    case 8: {
                        ArrayList<BankAccount> accs = bank.getAccounts();
                        StringBuilder s = new StringBuilder();
                        for(BankAccount acc : accs) {
                        	s.append(accs);
                        	s.append('\n');
                        }
                        JOptionPane.showMessageDialog(null, s.toString());
                        break;
                    }
                }
            } while (input != 0);
        } else if(input == 2) {
        	input = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Menu:\n1. Summary of an account.\n2. Display Transactions.\n3. Display all accounts.\n0. Exit\n\n Enter your choice:"));
        	while(input != 0) {
        		String accNum = JOptionPane.showInputDialog(null, "Account Number");
        		String mNid = JOptionPane.showInputDialog(null, "NID number: ");
        		switch(input) {
        			case 1: {
        				bank.getAccountSummary(accNum);
        				break;
        			}
        			case 2: {
        				ArrayList<Transaction> trns = bank.getAccTransactions(mNid, accNum);
        				StringBuilder s = new StringBuilder();
                        for(Transaction t : trns) {
                        	s.append(t);
                        	s.append('\n');
                        }
                        JOptionPane.showMessageDialog(null, s.toString());
                        break;
        			}
        			case 3: {
        				ArrayList<BankAccount> accs = bank.findAccounts(mNid);
                        StringBuilder s = new StringBuilder();
                        for(BankAccount acc : accs) {
                        	s.append(accs);
                        	s.append('\n');
                        }
                        JOptionPane.showMessageDialog(null, s.toString());
                        break;
        			}
        		}
        	}
        }
	}

}