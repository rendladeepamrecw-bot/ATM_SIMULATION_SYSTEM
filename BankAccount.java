import java.util.ArrayList;

public class BankAccount {

    private double balance;
    private ArrayList<String> transactions;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
        transactions = new ArrayList<>();
        transactions.add("Account Opened | Initial Balance: ₹" + balance);
    }

    // Get Current Balance
    public double getBalance() {
        return balance;
    }

    // Deposit Money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        balance += amount;
        transactions.add("Deposited: ₹" + amount);

        System.out.println("₹" + amount + " deposited successfully.");
        System.out.println("Current Balance: ₹" + balance);
    }

    // Withdraw Money
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
            return;
        }

        balance -= amount;
        transactions.add("Withdrawn: ₹" + amount);

        System.out.println("Please collect your cash.");
        System.out.println("Remaining Balance: ₹" + balance);
    }

    // Display Balance
    public void showBalance() {
        System.out.println("\n========== ACCOUNT BALANCE ==========");
        System.out.println("Current Balance : ₹" + balance);
    }

    // Display Mini Statement
    public void showMiniStatement() {

        System.out.println("\n========== MINI STATEMENT ==========");

        if (transactions.isEmpty()) {
            System.out.println("No Transactions Found.");
        } else {
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Available Balance : ₹" + balance);
    }
}