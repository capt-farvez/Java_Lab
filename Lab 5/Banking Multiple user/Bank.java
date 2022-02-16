package lab4;
import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
	    int i=0, res=0; 	
    	BankAccount account[]= new BankAccount[10];
	    Scanner input = new Scanner(System.in).useDelimiter("\r\n");
		
	while(true) {
		System.out.println("Menu : \n Enter 1 for Create Account. \n Enter 2 for Deposit Money. \n Enter 3 for Withdraw Money. \n Enter 4 Check Balance. \n Enter 5 for Display all Account. \n Enter 0 for Exit. \n Thank You ! "); 
		int check = input.nextInt();
		
		switch(check) {
		case 1: 
			System.out.println("Please , Enter Account Name...");
			String name1= input.next();
			System.out.println("Enter Account Number ...");
			String id1 = input.next();
			System.out.println("Enter Your Balance..");
			double balance1 = input.nextDouble();
			account[i++]= new BankAccount(name1, id1, balance1);
			System.out.println("Congratulations .. Account Created  ");
			int x=i-1;
			account[x].display();
			break;
					
		case 2:
		
			System.out.println("Enter Account Number. ");
			String accNum = input.next();
			for(int j=0 ; j<i; j++) {
				if(account[j].accNum == accNum) {
					System.out.println("Enter Deposit Ammount ");
					double money= input.nextDouble();
					account[j].deposit(money);
					System.out.println("New Balance is "+account[j].getBalance());
				}
				else {
					res= -1;
				}
			}
			
			if(res == -1) {
				System.out.println("Account Not Found.");
			}
			
			break;
		
		
		case 3:
		
			System.out.println("Enter Account Number. ");
			String accNum1 = input.next();
			for(int j=0 ; j<i; j++) {
				if(account[j].accNum == accNum1) {
					System.out.println("Enter Withdraw Ammount ");
					double money= input.nextDouble();
					account[j].withdraw(money);
					System.out.println("Balance is "+account[j].getBalance());
				}
				else {
					res= -1;
				}
			}
			
			if(res == -1) {
				System.out.println("Account Not Found.");
			}
			
			break;
		
		
		case 5:
		{
			for(int j=0; j<i; j++) {
				account[j].display();
			}
		}
			break;
			
		case 0:
			input.close();
			System.exit(0);
		}
		
		
	} 

	}	
}
