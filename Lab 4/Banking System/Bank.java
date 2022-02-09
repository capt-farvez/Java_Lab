package Lab4;
import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your name : ");
		String name = input.nextLine();
		System.out.println("Enter Your Bank ID : ");
		String accNum = input.nextLine();
		System.out.println("Enter Your Balance : ");
		double balance= input.nextDouble();
		
		BankAccount account=new BankAccount(name, accNum, balance);
		
		while(true) {
			System.out.println("Please ,\n Press '1' for Deposit. \n Press '2' for Withdraw. \n Press '3' for Display Balance. \n Press '0' for Exit. \n ");
			
			int x= input.nextInt();
			switch(x) {
			case 1:
				System.out.println("Enter the Ammount you want to Deposit: ");
				double money= input.nextDouble();
				account.deposit(money);
				System.out.println("Current balance is : "+account.balance);
				break;
				
			case 2:
				System.out.println("Enter the Ammount you want to Withdraw: ");
				double money1= input.nextDouble();
				account.withdraw(money1);
				System.out.println("Current balance is : "+account.balance);
				break;
				
			case 3:
				double d_balance= account.getBalance();
				System.out.println("Balance is :"+d_balance);
				account.display();
				break;
			
			case 0:
				input.close();
				System.exit(0);
			
			}			
		}
		
		
		
	}
}
