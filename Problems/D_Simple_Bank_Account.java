package Problems;

public class D_Simple_Bank_Account {

    // 1. Declare BankAccount as static so main() can instantiate it directly
    static class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        // Deposit method
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". Remaining balance: $" + balance);
            } else if (amount > balance) {
                System.out.println("Insufficient funds! Balance is $" + balance);
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }

        // Getter for balance
        public double getBalance() {
            return balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }
    }

    // 2. The main method goes directly inside the outer public class matching the filename
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 500.0);

        System.out.println("Initial Balance: $" + account.getBalance());

        // Test deposit
        account.deposit(200.0);

        // Test valid withdrawal
        account.withdraw(150.0);

        // Test invalid withdrawal (overdraft)
        account.withdraw(600.0);
    }
}