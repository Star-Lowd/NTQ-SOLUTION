/**
 * 
 */
/**
 * @author Star Blazh
 *
 */
package ThreadMonitor;

import java.util.*;

public class ThreadRun {
	public static void main(String[] args) {
		System.out.println("How to use wait and notify method in Java");
		System.out.println("Solving Producer Consumper Problem");
		Queue<Integer> buffer = new LinkedList<>();
		int maxSize = 10;

		Producer producer = new Producer(buffer, maxSize, "Producer");
		Consumer consumer = new Consumer(buffer, maxSize, "CONSUMER");
		producer.start();
		consumer.start();

	}
}
