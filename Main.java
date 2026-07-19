public class Main {

    public static void main(String[] args) {

        // Create User
        User user = new User(
                "Deepa Rendla",
                "123456789012",
                1234
        );

        // Create Bank Account with Initial Balance
        BankAccount account = new BankAccount(25000);

        // Create ATM
        ATM atm = new ATM(user, account);

        System.out.println("=======================================");
        System.out.println("        WELCOME TO JAVA ATM");
        System.out.println("=======================================");

        // Login
        if (atm.login()) {
            atm.startATM();
        }

        System.out.println("\nThank You!");
    }
}