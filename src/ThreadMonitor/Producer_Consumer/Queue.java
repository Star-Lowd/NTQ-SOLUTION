package ThreadMonitor.Producer_Consumer;

import java.util.ArrayList;

public class Queue<V> implements IQueue {
	private java.util.List<V> values ;
	private int initialCapacity = 0;
	
	public Queue(int initialCapacity) {
		this.initialCapacity = initialCapacity;
		values = new ArrayList();
	}
	
	public Queue() {
		initialCapacity = INIT;
		values = new ArrayList();
	}

	@Override
	public Object pop() {
		return values.isEmpty() ? null : values.remove(0);
	}

	@Override
	public Object get(int pos) {
		return values.get(pos);
	}

	@Override
	public boolean add(Object value) {
		return values.add((V) value);
	}
	@Override
	public boolean isEmpty(){
		return values.isEmpty();
	}
	
	
}
