package lab8;
import javax.swing.JOptionPane;

public class BankApp {
	public static void main (String[] args ) {
		Bank ba=new Bank();
		while (true) {
			String input= JOptionPane.showInputDialog("Please press : \n 1 to Create new Account. \n 2 to Deposit balance. \n 3 to Withdraw Balance. \n 4 to Transfer Balance. \n 5 to Check Balance. \n 6 to View Account Information.\n  ");
			
			int option = Integer.parseInt(input);
			
			switch(option){
			case 1:
			{
				   int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account type: \n1. Savings \n2. Current"));
                   String name = JOptionPane.showInputDialog(null, "Account Name");
                   String Nid = JOptionPane.showInputDialog(null, "NID number: ");
                   int mNid = Integer.parseInt(Nid);
                   double balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Account Balance"));
                   if(type == 1) {
                       double maxWithLimit = Double.parseDouble(JOptionPane.showInputDialog(null, "Max Withdrawal Limit:"));
                       ba.addAccount(name, mNid, balance, maxWithLimit);
                   		}
                   else {
                       String tradeLicense = JOptionPane.showInputDialog(null, "Trade License");
                       ba.addAccount(name, mNid, balance, tradeLicense);
                   }
                   break;
			}
			case 2:
			{
				 String accNum = JOptionPane.showInputDialog(null, "Account Number");
                 double balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Deposit Amount"));
                 ba.deposit(accNum, balance);
                 break;
			}
			case 3:
			{
				 String accNum = JOptionPane.showInputDialog(null, "Account Number");
                 double balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Withdrawal Amount"));
                 ba.withdraw(accNum, balance);
                 break;
			}
			case 4:
			{
				String fromacc= JOptionPane.showInputDialog("Please enter your Account number.");
				String toacc = JOptionPane.showInputDialog("Please enter receiver Account number.");
				String strammount = JOptionPane.showInputDialog("Please enter the Ammount.");
				double ammount = Double.parseDouble(strammount);
				ba.transfer(fromacc, toacc, ammount);
			}
			case 5:
			{
				String accNum = JOptionPane.showInputDialog("Please enter Account number.");
				ba.getBalance(accNum);
				break;
			}
			case 6:
			{
				String accNum = JOptionPane.showInputDialog("Please enter Account number.");
				ba.getAccountSummary(accNum);
				break;
			}
			case 0:
			{
				System.exit(0);
			}
			}
			
		}

	}
}
