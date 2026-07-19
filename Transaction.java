import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private String type;
    private double amount;
    private String dateTime;

    // Constructor
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        dateTime = LocalDateTime.now().format(formatter);
    }

    // Display Transaction
    public void displayTransaction() {
        System.out.println("----------------------------------------");
        System.out.println("Transaction Type : " + type);
        System.out.println("Amount           : ₹" + amount);
        System.out.println("Date & Time      : " + dateTime);
    }

    @Override
    public String toString() {
        return dateTime + " | " + type + " | ₹" + amount;
    }
}