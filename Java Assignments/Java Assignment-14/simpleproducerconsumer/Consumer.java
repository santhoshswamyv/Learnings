package javaassignment14.simpleproducerconsumer;

import java.util.List;

public class Consumer implements Runnable {
	private List<Integer> buffer;

	public Consumer(List<Integer> buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consume();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void consume() throws InterruptedException {
		synchronized (buffer) {
			while (buffer.isEmpty()) {
				System.out.print("Buffer is empty. Consumer is waiting...");
				buffer.wait();
			}

			int item = buffer.remove(0);
			System.out.println("Consumed: " + item);
			buffer.notifyAll();
		}
	}
}