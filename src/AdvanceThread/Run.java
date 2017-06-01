package AdvanceThread;

public class Run {
	
	public static void main(String[] args) {
		
		PeopleThread pt = new PeopleThread();
		pt.addPeople(2000).start();
		pt.Update(5000).start();
		pt.Remove(5000).start();
	}
}
