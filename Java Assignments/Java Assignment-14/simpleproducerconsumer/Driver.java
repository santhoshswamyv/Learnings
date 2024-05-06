package javaassignment14.simpleproducerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
        List<Integer> buffer = new ArrayList<>();
        int capacity = 5;

        Thread producer = new Thread(new Producer(buffer, capacity));
        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();
    }
}
