package lab8;

public class CurrentAccount extends BankAccount {
	private String tradeLicenseNumber;
	public CurrentAccount(String memberName, int nid, double accBalance, String tradeLicense) {
		super(memberName, nid, accBalance, 5000);
		this.tradeLicenseNumber=tradeLicense;
		
	}
	@Override
    public String toString() {
        return String.format("%s-%s", super.toString(), tradeLicenseNumber);
    }
	

}
