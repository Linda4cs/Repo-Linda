public class Transactions {
    public static void main(String[] args) {
        // Account created with name, account number, and initial balance
        Account account1 = new Account("Linda Dike", "24536890", 1500.0);
        account1.displayAccountDetails();

        // Account created with name and account number, balance is set to zero
        Account account2 = new Account("Kamsi Charles", "60845367");
        account2.displayAccountDetails();

        // Performing transactions on account1
        account1.deposit(250);
        account1.withdraw(120);

        // Performing transactions on account2 (which started with zero balance)
        account2.deposit(400);
        account2.withdraw(100);

        // Display final account details
        System.out.println("\nSummary of Account 1 Details:");
        account1.displayAccountDetails();

        System.out.println("\nSummary of Account 2 Details:");
        account2.displayAccountDetails();
    }
}
