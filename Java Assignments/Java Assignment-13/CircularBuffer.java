package javaassignment13;

import java.util.ArrayList;

public class CircularBuffer {
	private ArrayList<String> buffer;
	private int size;
	private int curSize = 0;

	public CircularBuffer(int size) {
		this.size = size;
		this.buffer = new ArrayList<>(size);
	}

	public void addMessage(String message) {
		if (curSize < size) {
			buffer.add(curSize, message);
		} else {
			int newSize = curSize % size;
			buffer.set(newSize, message);
		}
		curSize++;
	}

	public void displayMessages() {
		for (int i = 0; i < buffer.size(); i++) {
			System.out.println(buffer.get(i));
		}
	}

	public static void main(String[] args) {
		CircularBuffer buffer = new CircularBuffer(3);

		buffer.addMessage("Hiii Nagaraj..!");
		buffer.addMessage("Hiii Singam..!");
		buffer.addMessage("Hiii Aleem..!");
		buffer.addMessage("Hiii Swami..!");
		buffer.addMessage("Hiii Balaji..!");
		buffer.addMessage("Hiii Silent..!");
		buffer.addMessage("Hiii Sandy..!");
		buffer.addMessage("Hiii Ashi..!");

		buffer.displayMessages();
	}
}
