package Lab9;

public class CurrentAccount extends BankAccount {
	private String tradeLicenseNumber;

    public CurrentAccount(String memberName, String memberNID, double accountBalance, String tradeLicenseNumber) {
        super(memberName, memberNID, accountBalance, 5000);
        this.tradeLicenseNumber = tradeLicenseNumber;
    }

    @Override
    public String toString() {
        return String.format("%s-%s", super.toString(), tradeLicenseNumber);
    }
}
