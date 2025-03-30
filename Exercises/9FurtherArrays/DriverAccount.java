// Driver class to test the Bank functionality
public class DriverAccount {
    public static void main(String[] args) {
        LLBank bank = new LLBank();

        // Creating new account
        bank.createAccount(1000);
        bank.createAccount(200);
        bank.createAccount(2500);
        System.out.println();

        // making deposit
        bank.depositToAccount(1000, 100);
        bank.depositToAccount(1001, 500);
        System.out.println();

        bank.withdrawFromAccount(1000, 50);
        bank.withdrawFromAccount(1001, 1000); // Invalid withdrawal
        System.out.println();

        // Add interest to all accounts
        bank.addInterestToAllAccounts();
        System.out.println();

        // Using non-existing account to test
        bank.depositToAccount(8484, 700); // Account not found
    }
}
