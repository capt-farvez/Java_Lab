package Lab7;
import java.util.ArrayList;

public class UapCse {
	String deptName;
	ArrayList<Employee> employees= new ArrayList<>();
	public UapCse(String department) {
		this.deptName=department;
	}
	
	private void addNewEmployee(Employee emp) {
		employees.add(emp);
	}
	public void addNewEmployee(String nm, String des, double sal) {
		Employee em= new Employee(nm,des,sal);
		employees.add(em);	
	}
	private Employee findEmployee(String id) {
		for(int i=0; i<employees.size(); i++) {
			Employee empt= employees.get(i);
			if(empt.getId().equals(id)) {
				return empt;
			}
		}
		return null;
	}
	public void increaseSalary(String id, double newSal) {
		Employee empt= findEmployee(id);
		if(empt==null) {
			System.out.println("Employee not found.");
		}
		else {
			empt.increaseSalary(newSal);
		}
	}
	
	public void promote(String id, String newDes, double newSal) {
		Employee empt= findEmployee(id);
		if(empt==null) {
			System.out.println("Employee Not Found.");
		}
		else {
			empt.promote(newDes, newSal);
		}
		
	}
	public double getSalary(String id) {
		Employee empt= findEmployee(id);
		if(empt==null) {
			System.out.println("Employee Not Found.");
		}
		 return empt.getSalary();		
		
	}
	//Display Specific employee
	public void display(String id) {
		Employee empt = findEmployee(id);
		if(empt==null) {
			System.out.println("Account not Found.");
		}
		else {
			empt.display();
		}
		
	}
	//display all account
	public void display() {
		for(Employee empt: employees) {
			System.out.println(empt);
		}
	}

}
