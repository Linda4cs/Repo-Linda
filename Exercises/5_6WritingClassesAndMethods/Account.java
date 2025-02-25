public class Account {
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor to initialize name, account number, and balance
    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Second constructor to initialize name and account number, initial balance to be zero
    public Account(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Default balance is zero
    }

    // Method to withdraw an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Amount should be positive.");
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
