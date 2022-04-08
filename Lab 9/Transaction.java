package Lab9;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Transaction {
	double amount;
	String transactionType;
	LocalDateTime transactionTime;
	
	public Transaction(double amt, String type) {
		amount = amt;
		transactionType = type;
		transactionTime = LocalDateTime.now();  // Will Generate current time from PC
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		return String.format("%s\t%.2f\t%s", transactionTime.format(formatter), amount, transactionType);
	}
}