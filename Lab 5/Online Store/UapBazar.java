package lab4;
import java.util.Scanner;
public class UapBazar {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in).useDelimiter("\r\n");
		Product pro[]= new Product[10];
		int i=0, res =0;
		
		while(true) {
			System.out.println(" Menu \n Enter 1 for Add new product. \n Enter 2 for Upadate price of a product. \n Enter 3 for Get Discounted price of a Product . \n enter 4 for Show all Product. \n Enter 0 for Exit. ");
		int test= input.nextInt();
		switch(test) {
		case 1:
		{
			System.out.println("Enter Product Name..");
			String name1=input.next();
			System.out.println("Enter Product Id");
			String id=input.next();
			System.out.println("Enter Product Category");
			String category=input.next();
			System.out.println("Enter Price");
			double price=input.nextDouble();
			pro[i++]=new Product(name1, id, category, price);
			System.out.println("Product Added Succesfully ..");
			int x=i-1;
			pro[x].display();
			break;				
		}
		
		case 2:
		{
			System.out.println("Enter Product Id");
			String id=input.next();
			for(int j=0; j<i; j++) {
				if(pro[j].id== id) {
					System.out.println("Enter Updated Price");
					double money=input.nextDouble();
					pro[j].updatePrice(money);
					break;
				}
				else {
					res= -1;
				}
			}
			if(res == -1) {
				System.out.println("Product not Found .");
			}
		}
		
		case 3:
		{
			System.out.println("Enter Product Id");
			String id=input.next();
			for(int j=0; j<i; j++) {
				if(pro[j].id== id) {
					System.out.println("Enter Discount Percentage");
					double money=input.nextDouble();
					System.out.println("New Price is: ");
					pro[j].getDiscountedPrice(money);
					
					break;
				}
				else {
					res= -1;
				}
			}
			if(res == -1) {
				System.out.println("Product not Found .");
			}
		}
		
		case 4:
		{
			for(int j=0; j<i; j++) {
				pro[j].display();
			}
		}
		
		case 0:
			input.close();
			System.exit(0);
		
		}
		
		}
		
	}

}
