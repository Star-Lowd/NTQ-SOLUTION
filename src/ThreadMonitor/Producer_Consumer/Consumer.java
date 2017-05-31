package ThreadMonitor.Producer_Consumer;

public class Consumer extends Thread{
	Queue<Object> ages ; 
	
	public Consumer(Queue<Object> ages) {
		this.ages = ages;
		this.start();
	}
	
	@Override 
	public void run(){
		synchronized (ages) {
			//if (ages.)
		}
	}
	
}
