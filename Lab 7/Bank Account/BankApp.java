package lab7;
import javax.swing.JOptionPane;
public class BankApp {
	public static void main(String[] args) {
			Bank ba =new Bank("ABCD Bank");
			
			while(true) {
				String input= JOptionPane.showInputDialog("Please press : \n 1  to create account. \n 2  to Deposit. \n 3  to Withdraw. \n 4  to view specific Account. \n 5  to view all account. \n");
				
				int option = Integer.parseInt(input);
				switch(option) {
				case 1:
				{
					String name = JOptionPane.showInputDialog("Please enter Account name.");
					String iniBalance = JOptionPane.showInputDialog("Enter initial Balance. ");
					double balance=Double.parseDouble(iniBalance);
					ba.addAccount(name, balance);
					break;
				}
				case 2:
				{
					String accNum = JOptionPane.showInputDialog("Please enter Account number.");
					String bal =  JOptionPane.showInputDialog("Enter deposit Ammount. ");
					double balance= Double.parseDouble(bal);
					ba.deposit(accNum, balance);
					break;
				}
				case 3:
				{
					String accNum = JOptionPane.showInputDialog("Please enter Account number.");
					String bal =  JOptionPane.showInputDialog("Enter Withdraw Ammount. ");
					double balance= Double.parseDouble(bal);
					ba.withdraw(accNum, balance);
					break;
				}
				case 4:
				{
					String accNum = JOptionPane.showInputDialog("Please enter Account number.");
					ba.display(accNum);
					break;
				}
				case 5:
				{
					ba.display();
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
