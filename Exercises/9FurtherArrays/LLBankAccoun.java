// BankAccount class: Manages individual bank account operations
class BankAccount {

    private int accountCounter = 1500; // For unique account numbers
    private int accountNumber;
    private double balance;

    // Constructor to create a new account with an initial balance
    public BankAccount(double initialBalance) {
        this.accountNumber = accountCounter++;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
            System.out.println();
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
            System.out.println();
        } else {
            System.out.println("Insufficient balance for withdrawal.");
            System.out.println();
        }
    }

    // Method to add interest  (3% interest)
    public void addInterest() {
        double interest = balance * 4.12    ;
        balance += interest;
        System.out.println("Interest added: " + interest + ". New balance: " + balance);
        System.out.println();
    }

    // Getter for account balance
    public double getBalance() {
        return balance;
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }
}

// L&LBank class: Manages multiple bank accounts
class LLBank {
    private BankAccount[] accounts;
    private int numOfAccounts;

    // Constructor
    public LLBank() {
        accounts = new BankAccount[30]; // Max 30 customers
        numOfAccounts = 0;
    }

    // Create new account
    public void createAccount(double initialBalance) {
        if (numOfAccounts < 30) {
            accounts[numOfAccounts] = new BankAccount(initialBalance);
            numOfAccounts++;
            System.out.println("Account created with account number: " + accounts[numOfAccounts - 1].getAccountNumber());
        } else {
            System.out.println("Maximum number of accounts reached.");
            System.out.println();
        }
    }

    // Deposit to account
    public void depositToAccount(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
            System.out.println();
        }
    }

    // Withdraw from account
    public void withdrawFromAccount(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
            System.out.println();
        }
    }

    // Adding interest to all accounts
    public void addInterestToAllAccounts() {
        for (int i = 0; i < numOfAccounts; i++) {
            accounts[i].addInterest();
        }
    }

    // Using method to search account by account number
    private BankAccount findAccount(int accountNumber) {
        for (int i = 0; i < numOfAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }
}

