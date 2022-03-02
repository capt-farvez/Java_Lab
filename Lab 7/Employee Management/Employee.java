package Lab7;
import java.util.Random;

public class Employee {
	private String name;
	private String id;
	private String designation;
	private double salary;
	
	public Employee(String name, String designation, double salary) {
		this.name= name;
		this.designation= designation;
		this.salary=salary;
		Random rand = new Random();
		this.id="" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+rand.nextInt(10)+ rand.nextInt(10);
	}
	public void increaseSalary(double amt) {
		salary+=amt;
	}
	public void promote(String designation, double newSalary) {
		this.designation=designation;
		salary=newSalary;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	public void display() {
		System.out.println(this);
	}
	public String toString() {
		return " Name : "+name+", ID : "+id+", Designation : "+designation+", Salary: "+salary+" " ;
	}
	

}
