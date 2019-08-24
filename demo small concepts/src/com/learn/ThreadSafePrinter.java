package com.learn;

public class ThreadSafePrinter {

	public static void main(String[] args) {
		ThreadSafePrinteringMachine p = new ThreadSafePrinteringMachine();
		ThreadSafeUser samarth = new ThreadSafeUser(p);
		ThreadSafeUser Esha = new ThreadSafeUser(p);
	}

}

class ThreadSafeUser implements Runnable {
	ThreadSafePrinteringMachine p;
	Thread t;

	ThreadSafeUser(ThreadSafePrinteringMachine p) {
		this.p = p;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		try {
			p.print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ThreadSafePrinteringMachine {
	synchronized void print() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
}


