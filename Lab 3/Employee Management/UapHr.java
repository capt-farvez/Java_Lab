
public class UapHr {
	public static void main(String[] args) {
		
		Employee person1 = new Employee("Rafiq khan", "AS3001","Officer", 55000);
		
		
		double salary1 = person1.getSalary();
		System.out.println("Salary is : "+salary1);
		
		person1.updateSalary(60000);
		System.out.println("Updated Salary is: "+person1.salary);
	
		person1.display();
				
		
	}

}
