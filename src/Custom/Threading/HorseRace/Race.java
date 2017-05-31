package Custom.Threading.HorseRace;

import java.util.LinkedList;
import java.util.List;

public class Race extends Thread{
	private boolean running;
	List<Horse> horses ;
	public Race() {
		running = true;
		horses = new LinkedList();
	}
	
	@Override 
	public void run(){
		
		for (int i = 0; i < 10; i++) {
			Horse horse = new Horse("Horse "+(i+1));
			horses.add(horse);
			horse.start();
			
		}
		
		while (running){
			
			System.out.println("\n=======================\n");
			for (int i = 0; i < horses.size(); i++) {
				System.out.println(horses.get(i).getName() +" Step:  "+horses.get(i).getTotalStep());
				if (!horses.get(i).isAlive()){
					running = false ;
					break;
				}
			}
			
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
