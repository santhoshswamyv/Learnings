package javaassignment11.question4;

import java.util.Scanner;

public class BankDemo {
	static Scanner sc = new Scanner(System.in);
	static Bank account;

	public static void main(String[] args) {
		try {
			System.out.println("Create new Account : ");
			System.out.println();
			int acc = (int) (Math.random() * 1000000);
			String accNo = "BNK" + acc;
			System.out.print("Account No : " + accNo);
			System.out.print("\nAccount Holder Name : ");
			String accHolderName = sc.nextLine();
			double balance = 1000;
			account = new Bank(accNo, accHolderName, balance);
			System.out.println("Account Created for " + accHolderName);
			boolean b = true;
			double amount;
			do {
				System.out.println("Choose the Option : \n1) Deposit \n2) Withdraw \n3) Exit");
				int key = sc.nextInt();
				switch (key) {
				case 1:
					System.out.print("Enter the Amount to Deposit : ");
					amount = sc.nextDouble();
					account.deposit(amount);
					break;
				case 2:
					System.out.print("Enter the Amount to Deposit : ");
					amount = sc.nextDouble();
					account.withdraw(amount);
					break;
				case 3:
					System.out.print("Thank You..!");
					b = false;
					break;
				default:
					System.out.println("Choose Correct Option..!");
					break;
				}

			} while (b);
		} catch (InsufficientBalanceException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
