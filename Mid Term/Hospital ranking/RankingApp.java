package lab;
import java.util.Scanner;
public class RankingApp {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in).useDelimiter("\r\n");
		Rank ranking = new Rank();
		int option;
		while(true){
			System.out.println("Menu:\n 1 to add new Hospital. \n 2 to List of Hospital by category.\n 3 Upadate Rank. \n 4 to List of hospital by Rank.\n 5 to exit .\n");
			option=input.nextInt();
			switch(option) {
			case 1:
			{
				String name, speciality, address;
				double rank;
				int usr;
				System.out.println("Enter new hospital name.");
				name= input.next();
				System.out.println("Enter new hospital Speciality.");
				speciality = input.next();
				System.out.println("Enter new hospital addresss.");
				address = input.next();
				System.out.println("Enter new hospital Rank.");
				rank = input.nextDouble();
				System.out.println("Enter new hospital Number of User.");
				usr = input.nextInt();
				ranking.addNewHospital(name,speciality,address,rank,usr);
				break;
				
			}
			case 2:
			{
				System.out.println("Enter category.");
				String spe= input.nextLine();
				ranking.listOfHospitalByCategory(spe);
				break;
			}
			case 3:
			{
				System.out.println("Enter hosapital name.");
				String name = input.nextLine();
				System.out.println("Enter new rank.");
				double r=input.nextDouble();
				ranking.updateRank(name,r);
				break;
			}
			case 4:
			{
				double r;
				System.out.println("Enter the the rank. \n");
				r=input.nextDouble();
				ranking.listOfHospitalAboveRank(r);
				break;
			}
			case 5:
			{
			System.exit(5);	
			}
			default:
				System.out.println("Wrong Input.\n");
				break;
			}
		}
	}
}
