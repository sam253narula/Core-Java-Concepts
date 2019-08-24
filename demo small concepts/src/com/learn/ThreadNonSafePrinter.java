package com.learn;

public class ThreadNonSafePrinter {

	public static void main(String[] args) {
		Printer p = new Printer();
		User samarth = new User(p);
		User Esha = new User(p);
	}

}

class User implements Runnable {
	Printer p;
	Thread t;

	User(Printer p) {
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

class Printer {
	 void print() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
}
