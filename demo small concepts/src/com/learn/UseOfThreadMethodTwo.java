package com.learn;

public class UseOfThreadMethodTwo {
	public static void main(String[] args) {
		MyThreadpart1 mt = new MyThreadpart1();
		MyThreadpart2 mt2 = new MyThreadpart2();
		Thread t3 = new MyThread3();
		t3.start();
		Thread t1 = new Thread(mt);
		t1.start();

	}
}

class MyThreadpart1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(i);
		}

	}
}

class MyThread3 extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);

		}
	}
}

class MyThreadpart2 implements Runnable {
	Thread t;

	public MyThreadpart2() {
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

	}

}