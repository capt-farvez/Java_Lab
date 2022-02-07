

public class Employee {
	
	public String name, id, designation;
	public double salary;
	
	public void updateSalary(double newSa) {
		salary = newSa;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void display() {
		System.out.printf("Name: [%s]; Id: [%s]; Designation: [%s]; Salary: [%.2f] \n",name, id, designation, salary);
	}
	
	public Employee(String name, String id, String designation, double salary) {
		this.name=name;
		this.id=id;
		this.designation=designation;
		this.salary=salary;
	}
}

