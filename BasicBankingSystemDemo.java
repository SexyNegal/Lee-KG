public class BasicBankingSystemDemo {
    public static void main(String[] args) {
    Bank bank = new Bank(10);
    // Create savings accounts
    bank.createSavingsAccount(101, "Alice", 1000.0, 2.5);
    bank.createSavingsAccount(102, "Bob", 2000.0, 3.0);
    // Create current accounts
    bank.createCurrentAccount(201, "Charlie", 1500.0, 500.0);
    bank.createCurrentAccount(202, "David", 2500.0, 1000.0);
    // Deposit money
    bank.deposit(101, 500.0);
    bank.deposit(201, 1000.0);
    // Withdraw money
    bank.withdraw(102, 300.0);
   bank.withdraw(202, 3000.0); // Exceeds overdraft limit
    // Display balance
     bank.displayBalance(101);
    bank.displayBalance(201);
    bank.displayBalance(103); // Account not found
    
    }
   }