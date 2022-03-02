package Lab7;
import javax.swing.JOptionPane;
public class Uap {
	public static void main(String[] args) {
		UapCse emp=new UapCse("UAP");
		String input= JOptionPane.showInputDialog("Please press : \n 1  to add new employee. \n 2  to get salary. \n 3  to increase. \n 4  to promote an Employee. \n 5  to view specific Account. \n 6  to view all account. \n");
		
		int option = Integer.parseInt(input);
		switch(option) {
		case 1:
		{
			String name= JOptionPane.showInputDialog("Please enter Employee name.");
			String des = JOptionPane.showInputDialog("Please enter Employee Designation.");
			String stsal=JOptionPane.showInputDialog("Please enter Ammount of salary.");
			double salary= Double.parseDouble(stsal);
			emp.addNewEmployee(name,des,salary);
			break;
		}
		
		case 2 :
		{
			String id = JOptionPane.showInputDialog("Please enter Employee ID.");
			emp.getSalary(id);
			break;
		}
		case 3:
		{
			String id=JOptionPane.showInputDialog("Please enter Employee ID.");
			String stsal=JOptionPane.showInputDialog("Please enter Ammount of salary.");
			double salary= Double.parseDouble(stsal);
			emp.increaseSalary(id, salary);
			break;
		}
		case 4:
		{
			String id=JOptionPane.showInputDialog("Please enter Employee ID.");
			String stsal=JOptionPane.showInputDialog("Please enter Ammount of New salary.");
			double salary= Double.parseDouble(stsal);
			String newdes= JOptionPane.showInputDialog("Please enter new designation.");
			emp.promote(id,  newdes, salary);
			break;
		}
		case 5:
		{
			String id = JOptionPane.showInputDialog("Please enter Employee ID.");
			emp.display();
			break;
		}
		case 6:
		{
			emp.display();
			break;
		}
		case 0:
		{
			System.exit(0);
			
		}
		}
		
	}

}
