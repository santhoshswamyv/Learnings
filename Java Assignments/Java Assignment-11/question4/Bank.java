package javaassignment11.question4;

public class Bank {
	private String accountNumber;
	private String accountHolder;
	private double balance;

	public Bank(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit of Rs." + amount + " successful. New balance: Rs." + balance);
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawal of Rs." + amount + " successful. New balance: Rs." + balance);
		} else {
			throw new InsufficientBalanceException("Insufficient balance. Available balance: Rs." + balance);
		}
	}
}
