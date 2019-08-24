package com.learn;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadWaitAndSignalConcept {
	public static void main(String[] args) {
		Queue q = new Queue();
		Operations opPut = new Operations(q, "putThread");
		Operations opGet = new Operations(q, "getThread");
	}
}

class Operations implements Runnable {
	Queue customQueue = new Queue();
	Thread t1;

	public Operations(Queue q, String nameOfthread) {
		this.customQueue = q;
		t1 = new Thread((Runnable) this, nameOfthread);
		t1.start();
	}

	@Override
	public void run() {
		try {
			if (t1.getName().equals("putThread")) {
				System.out.println("Current Thread" + t1.getName());
				int n = 5;
				while (n > 0) {
					customQueue.put(n + 3);
					n--;
					Thread.sleep(1000);
				}
			} else if (t1.getName().equals("getThread")) {
				System.out.println("Current Thread" + t1.getName());
				customQueue.take();
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Queue {
	final Lock lock = new ReentrantLock();
	final Condition notFull = lock.newCondition();
	final Condition notEmpty = lock.newCondition();
	int[] intArray = new int[6];
	int count;
	int putptr, takeptr;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	void put(int number) throws InterruptedException {
		lock.lock();
		try {
			if (count != intArray.length) {
				intArray[putptr] = number;
				// System.out.println("Element inserted at "+ putptr);
				// System.out.println("Queue elements are "+ Arrays.toString(intArray));
				LOGGER.log(Level.INFO, "Element inserted at " + putptr);
				LOGGER.log(Level.INFO, "Queue elements are " + Arrays.toString(intArray));
				putptr++;
				count++;
				notEmpty.signal();
				System.out.println("in side put signal called" + " " + "Count" + " " + count);
			} else if (count == intArray.length) {
				System.out.println("Queue is Full");
				notFull.await();
			}
		} finally {
			lock.unlock();
		}
	}

	int take() throws InterruptedException {
		lock.lock();
		try {
			if (count == 0) {
				notEmpty.await();
			}
			if (count < intArray.length) {
				int element = intArray[takeptr];
				LOGGER.log(Level.INFO, "Element taken from index " + takeptr);
				LOGGER.log(Level.INFO, "Queue elements are " + Arrays.toString(intArray));
				takeptr++;
				count--;
				notFull.signal();
				System.out.println("in side take signal called" + " " + "Count" + count);
				return element;
			} else if (count == intArray.length) {
				return -1;
			}
		} finally {
			lock.unlock();
		}

		return -1;
	}
}
