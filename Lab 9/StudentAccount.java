package Lab9;

public class StudentAccount extends SavingsAccount {
	private String studentId, institutionName;
	public StudentAccount(String memberName, String memberNID, String studentId, String insName, double accountBalance) {
		super(memberName, memberNID, accountBalance, 100, 20000);
		this.studentId = studentId;
		this.institutionName = insName;
	}
}