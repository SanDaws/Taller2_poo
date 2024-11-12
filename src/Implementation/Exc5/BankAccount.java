package Implementation.Exc5;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    // Attributes
    private String accountNumber;
    private String holder;
    private double balance;
    private List<String> transactionHistory;

    // Constructor
    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: $" + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: $" + amount + " | New Balance: $" + balance);
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount + " | New Balance: $" + balance);
            System.out.println("Successfully withdrew $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to show transaction history
    public void showTransactionHistory() {
        System.out.println("Transaction History for Account: " + accountNumber);
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
}

