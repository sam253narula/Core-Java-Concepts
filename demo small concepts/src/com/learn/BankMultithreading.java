package com.learn;


// 


//Thread communication problems. wait and notify solves the problem
public class BankMultithreading {

	public static void main(String[] args) {
		Bank b2 = new Bank(11223344, 2000);
		Transaction trans = new Transaction(b2, "Thread1");
		Transaction transtwo = new Transaction(b2, "Thread2");
	}
}

class Bank {
	int accountNumber;
	float balance;
	boolean flag = false;

	Bank(int accountNumber, float balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	void display() {
		System.out.println("accountNumber" + accountNumber);
		System.out.println("balance" + balance);
	}

	synchronized void deposit(int amount) throws InterruptedException {
		if (flag) {
			wait();
		}
		balance = balance + amount;
		System.out.println("balance after deposit : " + balance);
		flag = true;
		notify();
	}

	synchronized void withdraw(int amount) throws InterruptedException {
		if(!flag) {
			wait();
		}
		if (balance > 1000) {
			balance = balance - amount;
			System.out.println("Balance after withdraw : " + balance);
		} else {
			System.out.println("Insufficient balance" + balance);
		}
		flag = false;
		notify();
	}
}

class Transaction implements Runnable {
	Thread t1;
	Bank b;

	public Transaction(Bank b, String nameOfthread) {
		this.b = b;
		t1 = new Thread(this, nameOfthread);
		t1.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				if (t1.getName().equals("Thread1")) {
					System.out.println("Current Thread" + t1.getName());
					b.deposit(1000);
					Thread.sleep(1000);
				} else if (t1.getName().equals("Thread2")) {
					System.out.println("Current Thread" + t1.getName());
					b.withdraw(1000);
					Thread.sleep(500);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}