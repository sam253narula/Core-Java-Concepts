package com.learn;

public class UseOfThreadMethodOne {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MyThreadtest t = new MyThreadtest();
	}
}

class MyThreadtest implements Runnable {

	Thread t;

	MyThreadtest() {
		t = new Thread(this);
		t.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}
