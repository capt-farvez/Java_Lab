package ArrayList;
import java.util.Scanner;


public class BookStoreApp {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in).useDelimiter("\r\n");
		BookStore store = new BookStore();
		
		while(true) {
			System.out.println("Menu : \n Enter “1”, to display the Books: Title – Author – Quantity.\n "
					+  "Enter “2”, to order new books.\n "
					+  "Enter “3”, to sell books.\n "
					+  "Enter “0”, to exit the system.");
			
			int option= input.nextInt();
			switch(option) {
			
			case 1:
			{
				store.display();
				break;
			}
			
			case 2:
			{
				 	String title,author;
	                int numOfCopies;
	                System.out.println("Enter book Title.....");
	                title = input.next();
	                System.out.println("Enter Author name.....");
	                author = input.next();
	                System.out.println("Enter how much copies .....");
	                numOfCopies = input.nextInt();
	                input.nextLine(); 
	                store.order(title,author,numOfCopies);
	                break;
			}
			
			case 3:
			{
				String title,author;
                int numOfCopies;
                System.out.println("Enter book Title.....");
                title = input.next();
                System.out.println("Enter Author name.....");
                author = input.next();
                System.out.println("Enter how much copies .....");
                numOfCopies = input.nextInt();
                input.nextLine(); 
                store.sell(title,author,numOfCopies);
                break;
			}
			
			case 0:
				input.close();
				System.exit(0);
			}
		}
		
	}

}
