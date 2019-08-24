package com.learn;

import java.util.Scanner;

class staticBank {
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
		staticBank sb = new staticBank();
		sb.deposit(10);
		sb.withdraw(500);
		int operation;
		System.out.println("Please provide input for the oepration to be performed");
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to check balance");
		System.out.println("press 2 to withdraw money");
		System.out.println("press 3 to deposit money");
		operation = sc.nextInt();
		switch (operation) {
		case 1:
			System.out.println("balance" + sb.balance);
			break;
		case 2:
			System.out.println(sb.withdraw(500));
			break;
		case 3:
			System.out.println(sb.deposit(10));
			break;
		}

		// System.out.println("balance" +sb.balance);

	}

}
