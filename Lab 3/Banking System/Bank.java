public class Bank {
	
	public static void main(String[] args) {
		BankAccount person1= new BankAccount();
		person1.name= " Salam ";
		person1.id="987456";
		person1.balance= 4000.00;
		
		person1.withdraw(2000);
		System.out.println("Balance After Withdraw: "+person1.balance);
		
		person1.deposit(5000);
		System.out.println("Balance After Deposit: "+person1.balance);	

	}
}
