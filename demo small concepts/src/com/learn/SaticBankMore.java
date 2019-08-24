package com.learn;
import java.util.Scanner;

class staticBankMore {
	private String name;
	private int account_number;
	private int balance = 10;
	private double amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	boolean deposit(double amount) {
		balance += amount;
		return true;
	}

	boolean withdraw(double amount) {
		if (balance > 500) {
			balance -= amount;
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		int operation;
		staticBank sb[] = new staticBank[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sb.length; i++) {
			System.out.println("Enter account number");
			sb[i] = new staticBank();
			sb[i].setAccount_number(sc.nextInt());
			System.out.println("Enter balance for account number: " + sb[i].getAccount_number());
			sb[i].setBalance(sc.nextInt());
		}
		while (true) {
			System.out.println("Please provide the account number for which you want to performe operation");
			int account_number = sc.nextInt();
			for (int i = 0; i < sb.length; i++) {
				if (sb[i].getAccount_number() == account_number) {

					System.out.println("Press 1 to check balance");
					System.out.println("press 2 to withdraw money");
					System.out.println("press 3 to deposit money");
					System.out.println("press 4 to exit");
					operation = sc.nextInt();
					switch (operation) {
					case 1:
						System.out.println("balance" + sb[i].getBalance());
						break;
					case 2:
						System.out.println(sb[i].withdraw(500));
						break;
					case 3:
						System.out.println(sb[i].deposit(10));
						break;
					case 4:
					    System.exit(0);
					}
				}
			}

		}

	}

}
