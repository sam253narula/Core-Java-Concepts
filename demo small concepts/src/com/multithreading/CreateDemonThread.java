package com.multithreading;

public class CreateDemonThread {

	public static void main(String args[]) {
		// Create runnable action for daemon
		Runnable daemonRunner = new Runnable() {
			public void run() {
				// Repeat forever
				while (true) {
					System.out.println("I'm a Daemon.");
					// Sleep for half a second
					try {
						Thread.sleep(500);

					} catch (InterruptedException ignored) {

					}
				}
			}
		};
		// Create and start daemon thread
		Thread daemonThread = new Thread(daemonRunner);
		daemonThread.setDaemon(true);
		daemonThread.start();
		// Sleep for five seconds
		try {
			Thread.sleep(5000);

		} catch (InterruptedException ignored) {
		}
		System.out.println("Done.");
	}
}
