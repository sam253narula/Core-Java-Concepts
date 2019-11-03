package com.consumer.producer.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private Path fileToRead;
	private BlockingQueue<String> queue;

	public Producer(Path filePath, BlockingQueue<String> q) {
		fileToRead = filePath;
		queue = q;
	}

	@Override
	public void run() {
		try {
			BufferedReader reader = Files.newBufferedReader(fileToRead);
			String line;
			while ((line = reader.readLine()) != null) {
				try {
					queue.put(line);
					System.out.println(Thread.currentThread().getName() + " added \"" + line
							+ "\" to queue, queue size: " + queue.size());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println(Thread.currentThread().getName() + " finished");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}