package ThreadMonitor.Producer_Consumer;

public interface IQueue<V> {
	int INIT = 10;
	
	public V pop();
	public V get(int pos);
	public boolean isEmpty();
	boolean add(V value);
}
