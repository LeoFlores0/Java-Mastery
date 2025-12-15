package week5.day29;

public class Main {
	
	public static void main(String[] args) {
		        
		BankAccount b1 = new BankAccount("5123");
		BankAccount b2 = new BankAccount("5124");

		b1.deposit(200);
		b2.deposit(1000);

		b1.withdraw(100);
		b2.withdraw(1100);
	
		b1.applyMonthlyInterest();
		b2.applyMonthlyInterest();		
		        
		System.out.println("Balance for " + b1.getAccountNumber() + ": " + b1.getBalance());
		System.out.println("Transaction history for " + b1.getAccountNumber() + ": " + b1.getTransactionHistory());
		System.out.println("Balance for " + b2.getAccountNumber() + ": " + b2.getBalance());
		System.out.println("Transaction history for " + b2.getAccountNumber() + ": " + b2.getTransactionHistory());
		        
		System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
		BankAccount.printBankPolicy();
		 }
}