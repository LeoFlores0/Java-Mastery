package week5.day29;

import java.util.ArrayList;

public class BankAccount {
	
	// Instance fields
    private final String accountNumber;
    private double balance;
    private double overdraftLimit = 100; // default
    private ArrayList<String> transactionHistory = new ArrayList<>();
    
    // Static fields
    private static int totalAccounts;
    private static double interestRate = 0.02; // default 2%

    // Constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposit: " + amount);
    }

    // Withdraw method (with overdraft check)
    public void withdraw(double amount) {
        if (balance - amount > -overdraftLimit) {
        	balance -= amount;
        	transactionHistory.add("Withdraw: " + amount);
        } else {
        	System.out.println("Withdrawl denied: exceeds overdraft limit");
        }
    }

    // Apply monthly interest
    public void applyMonthlyInterest() {
        balance += balance * interestRate;
        transactionHistory.add("Applied monthly interest");
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public ArrayList<String> getTransactionHistory() {
    	return new ArrayList<>(transactionHistory);
    }

    // Static methods
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void printBankPolicy() {
    	 System.out.println("Overdraft limit is $" + new BankAccount("temp").overdraftLimit);
    	 System.out.println("Interest rate is " + (interestRate * 100) + "%");
    }

}
