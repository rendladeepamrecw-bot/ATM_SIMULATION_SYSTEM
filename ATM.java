import java.util.Scanner;

public class ATM {

    private User user;
    private BankAccount account;
    private Scanner sc;

    // Constructor
    public ATM(User user, BankAccount account) {
        this.user = user;
        this.account = account;
        sc = new Scanner(System.in);
    }

    // Login Method
    public boolean login() {

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter 4-digit PIN: ");
            int enteredPin = sc.nextInt();

            if (user.verifyPin(enteredPin)) {
                System.out.println("\nLogin Successful!");
                System.out.println("Welcome, " + user.getName());
                return true;
            } else {
                attempts--;
                System.out.println("Incorrect PIN.");

                if (attempts > 0) {
                    System.out.println("Attempts Remaining: " + attempts);
                }
            }
        }

        System.out.println("\nYour ATM Card has been Blocked.");
        return false;
    }

    // ATM Menu
    public void startATM() {

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println("          ATM MENU");
            System.out.println("==============================");
            System.out.println("1. Balance Inquiry");
            System.out.println("2. Cash Deposit");
            System.out.println("3. Cash Withdrawal");
            System.out.println("4. Mini Statement");
            System.out.println("5. Change PIN");
            System.out.println("6. Account Details");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account.showBalance();
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ₹");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter Withdrawal Amount: ₹");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    account.showMiniStatement();
                    break;

                case 5:
                    changePin();
                    break;

                case 6:
                    user.displayUserDetails();
                    break;

                case 7:
                    System.out.println("\nThank You for Using Our ATM.");
                    System.out.println("Have a Nice Day!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7);
    }

    // Change PIN
    private void changePin() {

        System.out.print("Enter Current PIN: ");
        int oldPin = sc.nextInt();

        if (user.verifyPin(oldPin)) {

            System.out.print("Enter New PIN: ");
            int newPin = sc.nextInt();

            System.out.print("Confirm New PIN: ");
            int confirmPin = sc.nextInt();

            if (newPin == confirmPin) {
                user.changePin(newPin);
                System.out.println("PIN Changed Successfully.");
            } else {
                System.out.println("PIN Mismatch.");
            }

        } else {
            System.out.println("Incorrect Current PIN.");
        }
    }
}