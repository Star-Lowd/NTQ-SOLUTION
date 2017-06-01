package AdvanceThread;

public class PeopleThread {
	protected static People people;
	
	public PeopleThread() {
		people = new People();
	}
	
	public Thread addPeople(long sleepTime){
		Thread add = new Thread(new Runnable() {
					
			@Override
			public void run() {
				System.out.println("\n");
				for(;;){
					try {
						people.Add();
						Thread.sleep(sleepTime);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}) ;
		
		return add;
	}
	
	public Thread Remove(long sleepTime){
		Thread remove = new Thread(new Runnable() {
					
			@Override
			public void run() {
				System.out.println("\n");
				for(;;){
					try {
						people.RemovePeople();
						Thread.sleep(sleepTime);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}) ;
		
		return remove;
	}
	
	public Thread Update(long sleepTime){
		Thread update = new Thread(new Runnable() {
					
			@Override
			public void run() {
				for(;;){
					System.out.println("\n");
					try {
						people.UpdatePeople();
						Thread.sleep(sleepTime);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		}) ;
		
		return update;
	}
	
}
