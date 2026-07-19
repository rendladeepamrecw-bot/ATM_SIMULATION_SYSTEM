public class User {
    private String name;
    private String accountNumber;
    private int pin;

    // Constructor
    public User(String name, String accountNumber, int pin) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    // Get User Name
    public String getName() {
        return name;
    }

    // Get Account Number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Verify PIN
    public boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }

    // Change PIN
    public void changePin(int newPin) {
        this.pin = newPin;
    }

    // Display User Details
    public void displayUserDetails() {
        System.out.println("Account Holder : " + name);
        System.out.println("Account Number : " + accountNumber);
    }
}