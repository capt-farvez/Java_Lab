package lab4;
import java.util.Scanner;
public class UapHr {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in).useDelimiter("\r\n");
		Employee person[] = new Employee[10];
		int i=0, result = 0;
		
		while (true) {
			System.out.println("Menu. \n Enter 1 To Add new Employee. \n Enter 2 to update the salary of an Employee. \n Enter 3 for Get the Salary of an Employee. \n Enter 4 to view Employee List. \n Enter 0 to Exit. \n");
			int check=input.nextInt();		
				switch(check) {
				case 1:
				{
					System.out.println("Please, Enter Name..");
					String name=input.next();
					System.out.println("Enter Id");
					String id= input.next();
					System.out.println("Enter Designation of the Employee.");
					String designation=input.next();
					System.out.println("Enter the Salary of the Employee.");
					double salary=input.nextDouble();
					person[i++]=new Employee(name, id, designation, salary);
					System.out.println("Congratulation. Succesfully Added the Employee ..");
					int a=i-1;
					person[a].display();
					break;
				}
				
				case 2:
				{
					System.out.println("Enter Employee Id");
					String id=input.next();
					for(int j=0; j<i; j++) {
						if(person[j].id== id) {
							System.out.println("Enter New Salary");
							double money=input.nextDouble();
							person[j].updateSalary(money);
							break;
						}
						else {
							result= -1;
						}
					}
					if(result == -1) {
						System.out.println("Employee not Found .");
					}
					break;
					
				}
				
				case 3:
				{
					System.out.println("Enter Employee Id");
					String id=input.next();
					for(int j=0; j<i; j++) {
						if(person[j].id== id) {
							System.out.println("Salary is "+person[j].getSalary());						
							break;
						}
						else {
							result= -1;
						}
					}
					if(result == -1) {
						System.out.println("Employee not Found .");
					}
					break;
				}
				
				case 4:
				{
					System.out.println("All Employees are:");
					for(int j=0; j<i; j++) {
						person[j].display();
					}
					break;
				}
				
				case 0:
					input.close();
					System.exit(0);
					
					default :
						System.out.println("Not a valid Option.");
						break;
				}
			}
		}
		
	

}
